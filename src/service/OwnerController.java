package service;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import model.OwnerModel;

public class OwnerController {

	public static JSONArray listOwners() {
		
		JSONArray returnableArray = new JSONArray();
		
		OwnerModel model = new OwnerModel();
		returnableArray = model.listOwners();
		
		return returnableArray;
		
	}
	
	public static JSONObject getOwner(int id) {
		
		JSONObject returnableObject = new JSONObject();
		
		OwnerModel model = new OwnerModel();
		model.setOwnerID(id);
		
		returnableObject = model.getOwner();
		
		return returnableObject;
	}
	
	public static JSONObject updateOwner(JSONObject inputParms) {
		
		String message = "";
		
		JSONObject result = new JSONObject();
		
		try {
		
			int ownerID = inputParms.getInt("ownerID");
			String firstName = inputParms.getString("firstName");
			String lastName = inputParms.getString("lastName");
			String phoneNumber = inputParms.getString("phoneNumber");
			String email = inputParms.getString("email");
			String SSN = inputParms.getString("SSN");
			String streetAddress = inputParms.getString("streetAddress");
			String city = inputParms.getString("city");
			String state = inputParms.getString("state");
			String zipcode = inputParms.getString("zipcode");
			
			OwnerModel model = new OwnerModel();
			model.setOwnerID(ownerID);
			model.setFirstName(firstName);
			model.setLastName(lastName);
			model.setPhoneNumber(phoneNumber);
			model.setEmail(email);
			model.setSSN(SSN);
			model.setStreetAddress(streetAddress);
			model.setCity(city);
			model.setState(state);
			model.setZipcode(zipcode);
			
			message = model.updateOwner();
			
			result.put("message", message);
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static JSONObject addOwner(JSONObject inputParms) {
		
		String message = "";
		
		JSONObject result = new JSONObject();

		try {
			
		String firstName = inputParms.getString("firstName");
		String lastName = inputParms.getString("lastName");
		String phoneNumber = inputParms.getString("phoneNumber");
		String email = inputParms.getString("email");
		String SSN = inputParms.getString("SSN");
		String streetAddress = inputParms.getString("streetAddress");
		String city = inputParms.getString("city");
		String state = inputParms.getString("state");
		String zipcode = inputParms.getString("zipcode");
				
		OwnerModel model = new OwnerModel();
		model.setFirstName(firstName);
		model.setLastName(lastName);
		model.setPhoneNumber(phoneNumber);
		model.setEmail(email);
		model.setSSN(SSN);
		model.setStreetAddress(streetAddress);
		model.setCity(city);
		model.setState(state);
		model.setZipcode(zipcode);
				
		message = model.addOwner();
				
			result.put("message", message);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
}
