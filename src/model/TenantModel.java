package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.json.JSONArray;
import org.json.JSONObject;

public class TenantModel {
	
	int tenantID;
	String firstName;
	String lastName;
	String phoneNumber;
	String email;
	String SSN;
	int tenantUnit;
	
	public TenantModel() {
		
	}

	public JSONArray listTenants() {
		
		MSSQLConnection mssqlConnection = new MSSQLConnection();
		
		String sqlString = "SELECT * " +
		"FROM " + mssqlConnection.getDatabase() + ".dbo.tenants WITH (NOLOCK) ";
		
		SQLQuery sqlQuery = new SQLQuery();
		sqlQuery.setSqlString(sqlString);
		
		return sqlQuery.lstQuery();
	}

	public JSONObject getTenant() {
		
		MSSQLConnection mssqlConnection = new MSSQLConnection();		
		String sqlString = "SELECT * " +
		  		"FROM " + mssqlConnection.getDatabase() + ".dbo.tenants WITH (NOLOCK) " +
				"WHERE tenantID = "+tenantID+"";
		
		SQLQuery sqlQuery = new SQLQuery();
		sqlQuery.setSqlString(sqlString);
		
		return sqlQuery.getQuery();
	}
	
	public JSONObject getTenantInfo() {
		
		MSSQLConnection mssqlConnection = new MSSQLConnection();		
		String sqlString = "SELECT [unitNumber], [rentRate] " +
		  		"FROM " + mssqlConnection.getDatabase() + ".dbo.tenants t WITH (NOLOCK) " +
		  		"JOIN [dbo].[units] u WITH (NOLOCK) " +
		  		"ON t.tenantUnit = u.unitID " +
		  		"JOIN [dbo].[properties] p WITH (NOLOCK) " +
		  		"ON u.unitProperty = p.propertyID " +
		  		"JOIN [dbo].[owners] o WITH (NOLOCK) " +
		  		"ON p.propertyOwner = o.ownerID " +
				"WHERE tenantID = "+tenantID+"";
		
		System.out.println("query happened");
		
		SQLQuery sqlQuery = new SQLQuery();
		sqlQuery.setSqlString(sqlString);
		
		System.out.println(sqlQuery.getQuery());
		System.out.println("getTenantInfo() of TenantModel.java worked");
		
		return sqlQuery.getQuery();
	}

	public String updateTenant() {
		
		String message = "Tenant Updated";
		
		try {
			
			MSSQLConnection mssqlConnection = new MSSQLConnection();
			Connection connection = mssqlConnection.getConnection();
			
			String sqlString = "UPDATE " + mssqlConnection.getDatabase() + ".dbo.tenants SET " +
					"firstName=IsNull(NullIf(?,''),firstName), lastName=IsNull(NullIf(?,''),lastName),"+
					"phoneNumber=IsNull(NullIf(?,''),phoneNumber), email=IsNull(NullIf(?,''),email),"+
					"SSN=IsNull(NullIf(?,''),SSN), tenantUnit=IsNull(?,tenantUnit) " + 
					"WHERE tenantID="+tenantID+"";
			
			PreparedStatement ps = connection.prepareStatement(sqlString);
			
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, phoneNumber);
			ps.setString(4, email);
			ps.setString(5, SSN);
			ps.setInt(6, tenantUnit);
			ps.executeUpdate();
			
			try { if (ps!= null) ps.close(); } catch (Exception e) {};
			try { if (connection != null) connection.close(); } catch (Exception e) {};
    	
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		} 
		
		return message;
	}

	public String addTenant() {
		
		String message = "Tenant Added";
		
		try {
			
			MSSQLConnection mssqlConnection = new MSSQLConnection();
			Connection connection = mssqlConnection.getConnection();
			
			String sqlString = "INSERT " + mssqlConnection.getDatabase() + ".dbo.tenants " +
					"(firstName, lastName, phoneNumber, email, SSN, tenantUnit) VALUES (?,?,?,?,?,?)";
			
			PreparedStatement ps = connection.prepareStatement(sqlString);
			
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, phoneNumber);
			ps.setString(4, email);
			ps.setString(5, SSN);
			ps.setInt(6, tenantUnit);
			ps.executeUpdate();
			
			try { if (ps!= null) ps.close(); } catch (Exception e) {};
			try { if (connection != null) connection.close(); } catch (Exception e) {};
    	
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		} 
		
		return message;
	}

	
	// Getters & Setters
	
	public int getTenantID() {
		return tenantID;
	}

	public void setTenantID(int tenantID) {
		this.tenantID = tenantID;
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

	public int getTenantUnit() {
		return tenantUnit;
	}

	public void setTenantUnit(int tenantUnit) {
		this.tenantUnit = tenantUnit;
	}

	
	
	
}




