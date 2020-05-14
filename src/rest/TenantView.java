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

import service.TenantController;

@Path("/tenants")
public class TenantView{
	
	@GET
	@Path("/list/")
	@Produces("application/json")
	@Consumes("application/json")
	public String listTenants() {
		
		JSONArray result = TenantController.listTenants();
		
		return result.toString();
	}
	
	@GET
	@Path("/{id}/")
	@Produces("application/json")
	@Consumes("application/json")
	public String getTenant(@PathParam("id") Integer id) {
		
		JSONObject result = TenantController.getTenant(id);
		
		return result.toString();
	}
	
	@GET
	@Path("/info/{id}/")
	@Produces("application/json")
	@Consumes("application/json")
	public String getTenantInfo(@PathParam("id") Integer id) {
		
		JSONObject result = TenantController.getTenantInfo(id);
		System.out.println("getTenantInfo() of TenantView.java worked");
		
		return result.toString();
	}
	
	@POST
	@Path("/update/")
	@Produces("application/json")
	@Consumes("application/json")
	public String updateTenant(String inputParms) {
		
		try {
			JSONObject result = TenantController.updateTenant(new JSONObject(inputParms));
			
			return result.toString();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return "updateTenant failed";
		}
	}
	
	@POST
	@Path("/add/")
	@Produces("application/json")
	@Consumes("application/json")
	public String addTenant(String inputParms) {
		
		try {
			JSONObject result = TenantController.addTenant(new JSONObject(inputParms));
			
			return result.toString();
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return "addTenant failed";
		}	
	}
}