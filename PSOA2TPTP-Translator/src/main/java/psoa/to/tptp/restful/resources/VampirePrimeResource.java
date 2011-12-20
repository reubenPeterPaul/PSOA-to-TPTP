package psoa.to.tptp.restful.resources;

import java.io.IOException;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.apache.commons.exec.ExecuteException;

import static psoa.to.tptp.restful.resources.Util.*;

@Path("/execute")
public class VampirePrimeResource {
	@Context UriInfo info;
	
	@POST
	public String getVampirePrimeResults(
		@FormParam("document") StringBuffer document,
		@FormParam("query") String query
	) {
		try {
			return vkernel(params(info), document.toString(), query);
		} catch (ExecuteException e) {
			e.printStackTrace();
			return "fail";
		} catch (IOException e) {
			e.printStackTrace();
			return "fail";
		} catch (InterruptedException e) {
			e.printStackTrace();
			return "fail";
		}
	}	
}
