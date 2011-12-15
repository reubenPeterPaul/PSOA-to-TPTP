
package org.ruleml;


import gnu.getopt.Getopt;
import gnu.getopt.LongOpt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.ruleml.api.DefaultAbstractSyntax;
import org.ruleml.api.presentation_syntax_parser.BasicRuleMLPresentationASTGrammar;
import org.ruleml.api.presentation_syntax_parser.RuleMLPresentationASTGrammar;
import org.ruleml.api.presentation_syntax_parser.RuleMLPresentationSyntaxLexer;
import org.ruleml.api.presentation_syntax_parser.RuleMLPresentationSyntaxParser;


/** Command line utility to validate the syntax of PSOA RuleML files. */
public class Validator {

    public static void main(String[] args) 
    {
	boolean importClosure = false;
	String[] ruleBaseFileNames = null;

	LongOpt[] longOpts = new LongOpt[256];
	
	// Reserved short option names: i ?
	longOpts[0] = new LongOpt("help", LongOpt.NO_ARGUMENT, null, '?');
	longOpts[1] = new LongOpt("import_closure", LongOpt.NO_ARGUMENT, null, 'i');

	Getopt optionsParse = new Getopt("", args, "?i", longOpts);
	
	for (int opt = optionsParse.getopt();
	     opt != -1;
	     opt = optionsParse.getopt())
	    {
		switch (opt)
		    {
		    case '?': 
			printUsage();
			System.exit(1);

		    case 'i':
			importClosure = true;
			break;

		    default:
			assert false;

		    }; // switch (opt)


	    }; // for (int nextOpt = optionsParse.getopt();
	
	int optInd = optionsParse.getOptind();

	if (args.length > optInd)
	    {
		ruleBaseFileNames = new String[args.length - optInd];
		for (int i = optInd; i < args.length; ++i)
		    ruleBaseFileNames[i - optInd] = args[i];
	    }
	else
	    {
		System.out.println("No rule base file specified.");
		printUsage();
		System.exit(1);
	    };
	
	try 
	    {	
		DefaultAbstractSyntax absSynFactory = 
		    new DefaultAbstractSyntax();

	       
		for (int i = 0; i < ruleBaseFileNames.length; ++i)
		    {
			System.err.println("\n\n% Processing rule base " + ruleBaseFileNames[i]);
			File ruleBaseFile = new File(ruleBaseFileNames[i]);
			
			Reader reader = new FileReader(ruleBaseFile);

			ANTLRReaderStream stream = 
			    new ANTLRReaderStream(reader);

			RuleMLPresentationSyntaxLexer lexer = 
			    new RuleMLPresentationSyntaxLexer(stream);

			CommonTokenStream tokenStream = 
			    new CommonTokenStream(lexer);

			RuleMLPresentationSyntaxParser parser = 
			    new RuleMLPresentationSyntaxParser(tokenStream);

// 			AbstractSyntax.Document doc = 
// 			    parser.parse(ruleBaseFile,absSynFactory);
			
			 RuleMLPresentationSyntaxParser.top_level_item_return kb = 
			    parser.top_level_item();

			reader.close();
			
			CommonTree ast = (CommonTree)kb.getTree();

			RuleMLPresentationASTGrammar treeParser = 
			    new RuleMLPresentationASTGrammar(new CommonTreeNodeStream(ast), absSynFactory);
			
			BasicRuleMLPresentationASTGrammar treeParser2 =
					new BasicRuleMLPresentationASTGrammar(new CommonTreeNodeStream(ast));
			
			/*AbstractSyntax.Document doc = 
			    treeParser.document(absSynFactory);*/

			treeParser2.document();
			
			System.out.println(ast.toStringTree());
			
			System.out.println("AST: " + ast);
			for (Object child : ast.getChildren())
			    System.out.println("CHILD: " + child);
			
			//System.out.println(doc.toStringInPresSyntax("   "));
			

			System.err.println("% End of rule base " + ruleBaseFileNames[i]);

		    }; // for (int i = 0; i < ruleBaseFileNames.length; ++i)

	    }
	catch (Exception ex)
	    {
		System.out.println("Error: " + ex);
		ex.printStackTrace();
		System.exit(1);
	    };



    } // main(String[] args)


	
	public static BasicRuleMLPresentationASTGrammar
		createBasicTreeParser(String filepath, boolean isQuery) throws RecognitionException, IOException
	{
		ANTLRInputStream fileInput = new ANTLRInputStream(new FileInputStream(filepath));
		RuleMLPresentationSyntaxLexer lexer = new RuleMLPresentationSyntaxLexer(fileInput);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		RuleMLPresentationSyntaxParser parser = new RuleMLPresentationSyntaxParser(tokens);
		ParserRuleReturnScope r;
		
		if (isQuery)
			r = parser.queries();
		else
			r = parser.top_level_item();
		
		System.out.println("Finished parsing " + filepath);
		
		CommonTree t = (CommonTree) r.getTree(); // get tree from parser
		// Create a tree node stream from resulting tree
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		return new BasicRuleMLPresentationASTGrammar(nodes);
	}

    private static void printUsage() {

	System.out.println("Usage: org.ruleml.Validator [OPTIONS] <rule base file>+");
	System.out.println("Options:");
	System.out.println("\t--help -? \n\t\t Print this message.");
	System.out.println("\t--import_closure -i \n\t\tProcess the whole import closures of the rule bases.");
    } // printUsage() 



} // class Validator