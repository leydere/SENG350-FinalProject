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

import service.UnitController;

@Path("/units")
public class UnitView{
	
	@GET
	@Path("/list/")
	@Produces("application/json")
	@Consumes("application/json")
	public String listUnits() {
		
		JSONArray result = UnitController.listUnits();
		
		return result.toString();
	}
	
	@GET
	@Path("/{id}/")
	@Produces("application/json")
	@Consumes("application/json")
	public String getUnit(@PathParam("id") Integer id) {
		
		JSONObject result = UnitController.getUnit(id);
		
		return result.toString();
	}
	
	@GET
	@Path("/tenants/{id}/")
	@Produces("application/json")
	@Consumes("application/json")
	public String getTenantUnit(@PathParam("id") Integer id) {
		
		JSONObject result = UnitController.getTenantUnit(id);
		
		return result.toString();
	}
	
	@POST
	@Path("/update/")
	@Produces("application/json")
	@Consumes("application/json")
	public String updateUnit(String inputParms) {
		
		try {
			JSONObject result = UnitController.updateUnit(new JSONObject(inputParms));
			
			return result.toString();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return "updateUnit failed";
		}
	}
	
	@POST
	@Path("/add/")
	@Produces("application/json")
	@Consumes("application/json")
	public String addUnit(String inputParms) {
		
		try {
			JSONObject result = UnitController.addUnit(new JSONObject(inputParms));
			
			return result.toString();
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return "addUnit failed";
		}	
	}
}