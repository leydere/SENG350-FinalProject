package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import service.OwnerController;

@Path("/owners")
public class OwnerView {

	@GET
	@Path("/list/")
	@Produces("application/json")
	@Consumes("application/json")
	public String listOwners() {
		
		JSONArray jArray = OwnerController.listOwners();
		return jArray.toString();
	}
	
	@GET
	@Path("/{id}/")
	@Produces("application/json")
	@Consumes("application/json")
	public String getOwner(@PathParam("id") Integer id) {
		
		JSONObject jObject = OwnerController.getOwner(id);
		
		return jObject.toString();
	}
	
	@POST
	@Path("/update/")
	@Produces("application/json")
	@Consumes("application/json")
	public String updateOwner(String inputParms) {
		
		try {
			JSONObject result = OwnerController.updateOwner(new JSONObject(inputParms));
			
			return result.toString();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return "updateOwner failed";
		}
	}
	
	@POST
	@Path("/add/")
	@Produces("application/json")
	@Consumes("application/json")
	public String addOwner(String inputParms) {
		
		try {
			JSONObject result = OwnerController.addOwner(new JSONObject(inputParms));
			
			return result.toString();
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return "addOwner failed";
		}	
	}
	
}
