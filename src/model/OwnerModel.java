package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.json.JSONArray;
import org.json.JSONObject;

public class OwnerModel {

	int ownerID;
	String firstName;
	String lastName;
	String phoneNumber;
	String email;
	String SSN;
	String streetAddress;
	String city;
	String state;
	String zipcode;
	
	public OwnerModel() {
		
	}
	
	public JSONArray listOwners() {
		
		MSSQLConnection mssqlConnection = new MSSQLConnection();
		
		String sqlString = "SELECT * " +
		"FROM " + mssqlConnection.getDatabase() + ".dbo.owners WITH (NOLOCK) ";
		
		SQLQuery sqlQuery = new SQLQuery();
		sqlQuery.setSqlString(sqlString);
		
		return sqlQuery.lstQuery();
	}
	
	public JSONObject getOwner() {
		
		MSSQLConnection mssqlConnection = new MSSQLConnection();		
		String sqlString = "SELECT * " +
		  		"FROM " + mssqlConnection.getDatabase() + ".dbo.owners WITH (NOLOCK) " +
				"WHERE ownerID = "+ownerID+"";
		
		SQLQuery sqlQuery = new SQLQuery();
		sqlQuery.setSqlString(sqlString);
		
		return sqlQuery.getQuery();
	}
	
	public String updateOwner() {
		
		String message = "Owner Updated";
		
		try {
			MSSQLConnection mssqlConnection = new MSSQLConnection();
			Connection connection = mssqlConnection.getConnection();
			
			String sqlString = "UPDATE " + mssqlConnection.getDatabase() + ".dbo.owners SET " +
					"firstName=IsNull(NullIf(?,''),firstName), lastName=IsNull(NullIf(?,''),lastName), phoneNumber=IsNull(NullIf(?,''),phoneNumber), " +
					"email=IsNull(NullIf(?,''),email), SSN=IsNull(NullIf(?,''),SSN), streetAddress=IsNull(NullIf(?,''),streetAddress), " +
					"city=IsNull(NullIf(?,''),city), state=IsNull(NullIf(?,''),state), zipcode=IsNull(NullIf(?,''),zipcode) " +
					"WHERE ownerID="+ownerID+"";

			PreparedStatement ps = connection.prepareStatement(sqlString);
			
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, phoneNumber);
			ps.setString(4, email);
			ps.setString(5, SSN);
			ps.setString(6, streetAddress);
			ps.setString(7, city);
			ps.setString(8, state);
			ps.setString(9, zipcode);
			ps.executeUpdate();
			
	    	try { if (ps!= null) ps.close(); } catch (Exception e) {};
	    	try { if (connection != null) connection.close(); } catch (Exception e) {}; 
			
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		}	
		
		return message;
	}
	
	public String addOwner() {
		
		String message = "Owner Added!";
		
		try {
			
			MSSQLConnection mssqlConnection = new MSSQLConnection();
			Connection connection = mssqlConnection.getConnection();
			
			String sqlString = "INSERT " + mssqlConnection.getDatabase() + ".dbo.owners " +
					"(firstName, lastName, phoneNumber, email, SSN, streetAddress, city, state, zipcode) VALUES (?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement ps = connection.prepareStatement(sqlString);
			
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, phoneNumber);
			ps.setString(4, email);
			ps.setString(5, SSN);
			ps.setString(6, streetAddress);
			ps.setString(7, city);
			ps.setString(8, state);
			ps.setString(9, zipcode);
			ps.executeUpdate();
			
			try { if (ps!= null) ps.close(); } catch (Exception e) {};
			try { if (connection != null) connection.close(); } catch (Exception e) {};
    	
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		} 
		
		return message;
	}

	
	// Getters & Setters
	public int getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
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
	
	
	
}
