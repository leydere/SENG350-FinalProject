package service;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import model.UnitModel;

public class UnitController{
	
	public static JSONArray listUnits() {
		
		JSONArray returnableArray = new JSONArray(); 
		
		UnitModel model = new UnitModel();
		returnableArray = model.listUnits();
		
		return returnableArray;
	}
	
	public static JSONObject getUnit(int id) {
		
		JSONObject returnableObject = new JSONObject();
		
		UnitModel model = new UnitModel();
		model.setUnitID(id);
		
		returnableObject = model.getUnit();
		
		return returnableObject;
	}
	
	public static JSONObject getTenantUnit(int id) {
		
		JSONObject returnableObject = new JSONObject();
		
		UnitModel model = new UnitModel();
		model.setUnitID(id);
		
		returnableObject = model.getTenantUnit();
		
		return returnableObject;
	}
	
	public static JSONObject updateUnit(JSONObject inputParms) {
		
		String message = "";
		
		JSONObject result = new JSONObject();

		try {
		
			int unitID = inputParms.getInt("unitID");
			String unitNumber = inputParms.getString("unitNumber");
			int rentRate = inputParms.getInt("rentRate");
			int unitProperty = inputParms.getInt("unitProperty");
			
			UnitModel model = new UnitModel();
			model.setUnitID(unitID);
			model.setUnitNumber(unitNumber);
			model.setRentRate(rentRate);
			model.setUnitProperty(unitProperty);
			
			message = model.updateUnit();
		
		
			result.put("message", message);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static JSONObject addUnit(JSONObject inputParms) {
		
		String message = "";
		
		JSONObject result = new JSONObject();

		try {
			
		String unitNumber = inputParms.getString("unitNumber");
		int rentRate = inputParms.getInt("rentRate");
		int unitProperty = inputParms.getInt("unitProperty");
				
		UnitModel model = new UnitModel();
		model.setUnitNumber(unitNumber);
		model.setRentRate(rentRate);
		model.setUnitProperty(unitProperty);
				
		message = model.addUnit();
				
			result.put("message", message);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}