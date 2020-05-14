package service;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import model.TenantModel;

public class TenantController{
	
	public static JSONArray listTenants() {
		
		JSONArray returnableArray = new JSONArray(); 
		
		TenantModel model = new TenantModel();
		returnableArray = model.listTenants();
		
		return returnableArray;
	}
	
	public static JSONObject getTenant(int id) {
		
		JSONObject returnableObject = new JSONObject();
		
		TenantModel model = new TenantModel();
		model.setTenantID(id);
		
		returnableObject = model.getTenant();
		
		return returnableObject;
	}
	
	public static JSONObject getTenantInfo(int id) {
		
		JSONObject returnableObject = new JSONObject();
		
		TenantModel model = new TenantModel();
		model.setTenantID(id);
		
		returnableObject = model.getTenantInfo();
		
		System.out.println(returnableObject);
		System.out.println("getTenantInfo() of TenantController.java worked");
		
		return returnableObject;
	}
	
	public static JSONObject updateTenant(JSONObject inputParms) {
		
		String message = "";
		
		JSONObject result = new JSONObject();

		try {
		
			int tenantID = inputParms.getInt("tenantID");
			String firstName = inputParms.getString("firstName");
			String lastName = inputParms.getString("lastName");
			String phoneNumber = inputParms.getString("phoneNumber");
			String email = inputParms.getString("email");
			String SSN = inputParms.getString("SSN");
			int tenantUnit = inputParms.getInt("tenantUnit");
			
			TenantModel model = new TenantModel();
			model.setTenantID(tenantID);
			model.setFirstName(firstName);
			model.setLastName(lastName);
			model.setPhoneNumber(phoneNumber);
			model.setEmail(email);
			model.setSSN(SSN);
			model.setTenantUnit(tenantUnit);
			
			message = model.updateTenant();
		
		
			result.put("message", message);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static JSONObject addTenant(JSONObject inputParms) {
		
		String message = "";
		
		JSONObject result = new JSONObject();

		try {
			
		String firstName = inputParms.getString("firstName");
		String lastName = inputParms.getString("lastName");
		String phoneNumber = inputParms.getString("phoneNumber");
		String email = inputParms.getString("email");
		String SSN = inputParms.getString("SSN");
		int tenantUnit = inputParms.getInt("tenantUnit");
				
		TenantModel model = new TenantModel();
		model.setFirstName(firstName);
		model.setLastName(lastName);
		model.setPhoneNumber(phoneNumber);
		model.setEmail(email);
		model.setSSN(SSN);
		model.setTenantUnit(tenantUnit);
				
		message = model.addTenant();
				
			result.put("message", message);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}