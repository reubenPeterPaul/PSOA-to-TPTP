package psoa.to.tptp.restful.resources;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import javax.ws.rs.GET;
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
	
	@GET
	@Path("/{psoa}")
	public String translate(@PathParam("psoa") String psoa) {
		OutputStream out = out();
		try {
			if (isQuery(params(info))) {
					convertQuery(decode(psoa), out);
			} else {
				convertDocument(decode(psoa), out);
			}
		} catch (RecognitionException e) {
			return "ERROR - Problem recognizing PSOA input.";
		} catch (IOException e) {
			return "SYSTEM ERROR - see system administrator.";
		}
		return psoa.toString();
	}
	
	private static boolean isQuery(Map<String,String> params) {
		return has(params,"query".toUpperCase());
	}
}
