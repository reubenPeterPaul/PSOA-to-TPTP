package psoa.to.tptp.restful.resources;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.apache.commons.exec.ExecuteException;

import static psoa.to.tptp.restful.resources.Util.*;

@Path("/execute")
public class VampirePrimeResource {
	@Context UriInfo info;
	
	@Path("/{rulebase}")
	@GET
	public String getVampirePrimeResults(@PathParam("rulebase") String rulebase) {
		
		try {
			return vkernel(params(info), rulebase, query(info));
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
