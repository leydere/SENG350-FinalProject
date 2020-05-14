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

import service.PropertyController;

@Path("/properties")
public class PropertyView{
	
	@GET
	@Path("/list/")
	@Produces("application/json")
	@Consumes("application/json")
	public String listProperties() {
		
		JSONArray result = PropertyController.listProperties();
		
		return result.toString();
	}
	
	@GET
	@Path("/{id}/")
	@Produces("application/json")
	@Consumes("application/json")
	public String getProperty(@PathParam("id") Integer id) {
		
		JSONObject result = PropertyController.getProperty(id);
		
		return result.toString();
	}
	
	@POST
	@Path("/update/")
	@Produces("application/json")
	@Consumes("application/json")
	public String updateProperty(String inputParms) {
		
		try {
			JSONObject result = PropertyController.updateProperty(new JSONObject(inputParms));
			
			return result.toString();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return "updateUserAPI failed";
		}
	}
	
	@POST
	@Path("/add/")
	@Produces("application/json")
	@Consumes("application/json")
	public String addProperty(String inputParms) {
		
		try {
			JSONObject result = PropertyController.addProperty(new JSONObject(inputParms));
			
			return result.toString();
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return "addProperty failed";
		}	
	}
}