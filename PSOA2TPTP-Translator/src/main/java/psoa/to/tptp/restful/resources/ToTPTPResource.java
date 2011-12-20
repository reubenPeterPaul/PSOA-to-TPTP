package psoa.to.tptp.restful.resources;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.antlr.runtime.RecognitionException;

import static psoa.to.tptp.restful.resources.Util.*;
import static psoa.to.tptp.restful.resources.Collections.*;

@Path("/translate")
public class ToTPTPResource {

	@Context UriInfo info;
	
	
	@POST
	@Path("/document")
	public String translate(@FormParam("document") StringBuffer doc) {
		OutputStream out = out();
		String psoa = decode(doc.toString());
		try {
			convertDocument(psoa, out);
		} catch (RecognitionException e) {
			return "ERROR - Problem recognizing PSOA input.";
		} catch (IOException e) {
			return "SYSTEM ERROR - see system administrator.";
		}
		return out.toString();
	}
	
	private static String decode(String s) {
		return s.replace("&gt;", ">");
	}
	
	@POST
	@Path("/query")
	public String translateQuery(@FormParam("query") StringBuffer q) {
		OutputStream out = out();
		String psoa = decode(q.toString());
		try {
			convertQuery(psoa, out);
		} catch (RecognitionException e) {
			return "ERROR - Problem recognizing PSOA input.";
		} catch (IOException e) {
			return "SYSTEM ERROR - see system administrator.";
		}
		return out.toString();
	}
}

