package service;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import model.PropertyModel;

public class PropertyController{
	
	public static JSONArray listProperties() {
		
		JSONArray returnableArray = new JSONArray(); 
		
		PropertyModel model = new PropertyModel();
		returnableArray = model.listProperties();
		
		return returnableArray;
	}
	
	public static JSONObject getProperty(int id) {
		
		JSONObject returnableObject = new JSONObject();
		
		PropertyModel model = new PropertyModel();
		model.setPropertyID(id);
		
		returnableObject = model.getProperty();
		
		return returnableObject;
	}
	
	public static JSONObject updateProperty(JSONObject inputParms) {
		
		String message = "";
		
		JSONObject result = new JSONObject();

		try {
		
			int propertyID = inputParms.getInt("propertyID");
			String streetAddress = inputParms.getString("streetAddress");
			String city = inputParms.getString("city");
			String state = inputParms.getString("state");
			String zipcode = inputParms.getString("zipcode");
			int numberOfUnits = inputParms.getInt("numberOfUnits");
			int propertyOwner = inputParms.getInt("propertyOwner");
			
			PropertyModel model = new PropertyModel();
			model.setPropertyID(propertyID);
			model.setStreetAddress(streetAddress);
			model.setCity(city);
			model.setState(state);
			model.setZipcode(zipcode);
			model.setNumberOfUnits(numberOfUnits);
			model.setPropertyOwner(propertyOwner);
			
			message = model.updateProperty();
		
		
			result.put("message", message);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static JSONObject addProperty(JSONObject inputParms) {
		
		String message = "";
		
		JSONObject result = new JSONObject();

		try {
			
		String streetAddress = inputParms.getString("streetAddress");
		String city = inputParms.getString("city");
		String state = inputParms.getString("state");
		String zipcode = inputParms.getString("zipcode");
		int numberOfUnits = inputParms.getInt("numberOfUnits");
		int propertyOwner = inputParms.getInt("propertyOwner");
				
		PropertyModel model = new PropertyModel();
		model.setStreetAddress(streetAddress);
		model.setCity(city);
		model.setState(state);
		model.setZipcode(zipcode);
		model.setNumberOfUnits(numberOfUnits);
		model.setPropertyOwner(propertyOwner);
				
		message = model.addProperty();
				
			result.put("message", message);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}