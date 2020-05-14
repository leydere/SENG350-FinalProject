package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.json.JSONArray;
import org.json.JSONObject;

public class PropertyModel {
	
	int propertyID;
	String streetAddress;
	String city;
	String state;
	String zipcode;
	int numberOfUnits;
	int propertyOwner;
	
	public PropertyModel() {
		
	}

	public JSONArray listProperties() {
		
		MSSQLConnection mssqlConnection = new MSSQLConnection();
		
		String sqlString = "SELECT * " +
		"FROM " + mssqlConnection.getDatabase() + ".dbo.properties WITH (NOLOCK) ";
		
		SQLQuery sqlQuery = new SQLQuery();
		sqlQuery.setSqlString(sqlString);
		
		return sqlQuery.lstQuery();
	}

	public JSONObject getProperty() {
		
		MSSQLConnection mssqlConnection = new MSSQLConnection();		
		String sqlString = "SELECT * " +
		  		"FROM " + mssqlConnection.getDatabase() + ".dbo.properties WITH (NOLOCK) " +
				"WHERE propertyID = "+propertyID+"";
		
		SQLQuery sqlQuery = new SQLQuery();
		sqlQuery.setSqlString(sqlString);
		
		return sqlQuery.getQuery();
	}

	public String updateProperty() {
		
		String message = "Property Updated";
		
		try {
			
			MSSQLConnection mssqlConnection = new MSSQLConnection();
			Connection connection = mssqlConnection.getConnection();
			
			String sqlString = "UPDATE " + mssqlConnection.getDatabase() + ".dbo.properties SET " +
					"streetAddress=IsNull(NullIf(?,''),streetAddress), city=IsNull(NullIf(?,''),city),"+
					"state=IsNull(NullIf(?,''),state), zipcode=IsNull(NullIf(?,''),zipcode),"+
					"numberOfUnits=IsNull(?,numberOfUnits), propertyOwner=IsNull(?,propertyOwner) " + 
					"WHERE propertyID="+propertyID+"";
			
			PreparedStatement ps = connection.prepareStatement(sqlString);
			
			ps.setString(1, streetAddress);
			ps.setString(2, city);
			ps.setString(3, state);
			ps.setString(4, zipcode);
			ps.setInt(5, numberOfUnits);
			ps.setInt(6, propertyOwner);
			ps.executeUpdate();
			
			try { if (ps!= null) ps.close(); } catch (Exception e) {};
			try { if (connection != null) connection.close(); } catch (Exception e) {};
    	
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		} 
		
		return message;
	}

	public String addProperty() {
		
		String message = "Property Added";
		
		try {
			
			MSSQLConnection mssqlConnection = new MSSQLConnection();
			Connection connection = mssqlConnection.getConnection();
			
			String sqlString = "INSERT " + mssqlConnection.getDatabase() + ".dbo.properties " +
					"(streetAddress, city, state, zipcode, numberOfUnits, propertyOwner) VALUES (?,?,?,?,?,?)";
			
			PreparedStatement ps = connection.prepareStatement(sqlString);
			
			ps.setString(1, streetAddress);
			ps.setString(2, city);
			ps.setString(3, state);
			ps.setString(4, zipcode);
			ps.setInt(5, numberOfUnits);
			ps.setInt(6, propertyOwner);
			ps.executeUpdate();
			
			try { if (ps!= null) ps.close(); } catch (Exception e) {};
			try { if (connection != null) connection.close(); } catch (Exception e) {};
    	
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		} 
		
		return message;
	}

	
	// Getters & Setters
		
	public int getPropertyID() {
		return propertyID;
	}

	public void setPropertyID(int propertyID) {
		this.propertyID = propertyID;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public int getNumberOfUnits() {
		return numberOfUnits;
	}

	public void setNumberOfUnits(int numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

	public int getPropertyOwner() {
		return propertyOwner;
	}

	public void setPropertyOwner(int propertyOwner) {
		this.propertyOwner = propertyOwner;
	}
	
}




