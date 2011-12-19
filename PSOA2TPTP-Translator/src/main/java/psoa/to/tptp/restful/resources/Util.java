package psoa.to.tptp.restful.resources;

import static psoa.to.tptp.restful.resources.Collections.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.ExecuteException;
import org.apache.log4j.Logger;
import org.ruleml.api.presentation_syntax_parser.BasicRuleMLPresentationASTGrammar;
import org.ruleml.api.presentation_syntax_parser.RuleMLPresentationSyntaxLexer;
import org.ruleml.api.presentation_syntax_parser.RuleMLPresentationSyntaxParser;
import static psoa.to.tptp.restful.resources.ShellUtil.*;

enum Util {
;

	protected static String vkernel(Map<String,String> params, String rulebase, String query) throws ExecuteException, IOException, InterruptedException {
		CommandLine cl = cl(VKERNEL);
		cl.addArgument(redirectTPTP(rulebase+query));
		DefaultExecuteResultHandler handler = resultHandler();
		OutputStream out = out();
		execute(cl,handler, out);
		handler.waitFor();
		return out.toString();
	}

	private static String redirectTPTP(String tptp) {
		return padl(rredirect(parenthesize(echo(tptp))));
	}
	
	protected static String decode(String s){
		try {
			return URLDecoder.decode(s, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			Logger.getLogger(Util.class).error("Failed to UTF-8 encode string.", e);
			return s;
		}
	}
	
	protected static Map<String,String> params(UriInfo info) {
		Map<String,String> params = map();
		for (Entry<String, String> e : flatten(rawParams(info))) {
			params.put(e.getKey().toUpperCase(), e.getValue());
		}
		return params;
	}
	
	private static MultivaluedMap<String,String> rawParams(UriInfo info) {
		return info.getQueryParameters();
	}
	
	private static Set<Entry<String,String>> flatten(MultivaluedMap<String, String> multi) {
		Map<String,String> m = map();
		for (Entry<String,List<String>> e : multi.entrySet()) {
			m.put(e.getKey(),first(e.getValue()));
		}
		return m.entrySet();
	}
	
	protected static String query(UriInfo info){
		return "";
	}
	
	
	protected static void convertDocument(String doc, OutputStream out) throws RecognitionException, IOException {
		BasicRuleMLPresentationASTGrammar treeParser = treeParser(doc);
		
		treeParser.setOutStream(out);
		treeParser.document();
	}
	
	protected static void convertQuery(String doc, OutputStream out) throws RecognitionException, IOException {
		BasicRuleMLPresentationASTGrammar treeParser = treeParser(doc);
		
		treeParser.setOutStream(out);
		treeParser.queries();
	}
	
	protected static BasicRuleMLPresentationASTGrammar treeParser(String doc) throws IOException, RecognitionException {
		
		ANTLRInputStream in = in(byteStream(bytes(doc)));
		CommonTokenStream tokens = tokens(lexer(in));
		return new BasicRuleMLPresentationASTGrammar(treeNodes(tokens));
		
	}
	
	protected static InputStream byteStream(byte[] bytes) {
		return new ByteArrayInputStream(bytes);
	}
	
	protected static byte[] bytes(String s) {
		return s.getBytes();
	}
	
	protected static ANTLRInputStream in(InputStream i) throws IOException {
		return new ANTLRInputStream(i);
	}
	
	protected static RuleMLPresentationSyntaxLexer lexer(ANTLRInputStream in) {
		return new RuleMLPresentationSyntaxLexer(in);
	}
	
	protected static CommonTokenStream tokens(Lexer lexer) {
		return new CommonTokenStream(lexer);
	}
	
	@SuppressWarnings("unchecked")
	protected static CommonTreeNodeStream treeNodes(CommonTokenStream tokens) throws RecognitionException {
		ParserRuleReturnScope r = queries(parser(tokens));
		return new CommonTreeNodeStream(r.getTree());
	}
	
	protected static BasicRuleMLPresentationASTGrammar treeParser(CommonTreeNodeStream nodes) {
		return new BasicRuleMLPresentationASTGrammar(nodes);
	}
	
	protected static RuleMLPresentationSyntaxParser parser(CommonTokenStream tokens) {
		return new RuleMLPresentationSyntaxParser(tokens);
	}
	
	protected static ParserRuleReturnScope queries(RuleMLPresentationSyntaxParser parser) throws RecognitionException {
		return parser.queries();
	}
	
	protected static ParserRuleReturnScope top(RuleMLPresentationSyntaxParser parser) throws RecognitionException {
		return parser.top_level_item();
	}
	
	protected static OutputStream out() {
		return new ByteArrayOutputStream();
	}
}
