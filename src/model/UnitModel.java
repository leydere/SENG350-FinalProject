package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.json.JSONArray;
import org.json.JSONObject;

public class UnitModel {
	
	int unitID;
	String unitNumber;
	int rentRate;
	int unitProperty;
	
	public UnitModel() {
		
	}

	public JSONArray listUnits() {
		
		MSSQLConnection mssqlConnection = new MSSQLConnection();
		
		String sqlString = "SELECT * " +
		"FROM " + mssqlConnection.getDatabase() + ".dbo.units WITH (NOLOCK) ";
		
		SQLQuery sqlQuery = new SQLQuery();
		sqlQuery.setSqlString(sqlString);
		
		return sqlQuery.lstQuery();
	}

	public JSONObject getUnit() {
		
		MSSQLConnection mssqlConnection = new MSSQLConnection();		
		String sqlString = "SELECT * " +
		  		"FROM " + mssqlConnection.getDatabase() + ".dbo.units WITH (NOLOCK) " +
				"WHERE unitID = "+unitID+"";
		
		SQLQuery sqlQuery = new SQLQuery();
		sqlQuery.setSqlString(sqlString);
		
		return sqlQuery.getQuery();
	}
	
	public JSONObject getTenantUnit() {
		
		MSSQLConnection mssqlConnection = new MSSQLConnection();		
		String sqlString = "SELECT * " +
		  		"FROM " + mssqlConnection.getDatabase() + ".dbo.units u WITH (NOLOCK) " +
		  		"INNER JOIN dbo.tenants t " +
		  		"ON u.unitID = t.tenantUnit " +
				"WHERE tenantID = "+unitID+"";
		
		SQLQuery sqlQuery = new SQLQuery();
		sqlQuery.setSqlString(sqlString);
		
		return sqlQuery.getQuery();
	}

	public String updateUnit() {
		
		String message = "Unit Updated";
		
		try {
			
			MSSQLConnection mssqlConnection = new MSSQLConnection();
			Connection connection = mssqlConnection.getConnection();
			
			String sqlString = "UPDATE " + mssqlConnection.getDatabase() + ".dbo.units SET " +
					"unitNumber=IsNull(NullIf(?,''),unitNumber), " +
					"rentRate=IsNull(?,rentRate), unitProperty=IsNull(?,unitProperty) " + 
					"WHERE unitID="+unitID+"";
			
			PreparedStatement ps = connection.prepareStatement(sqlString);
			
			ps.setString(1, unitNumber);
			ps.setInt(2, rentRate);
			ps.setInt(3, unitProperty);
			ps.executeUpdate();
			
			try { if (ps!= null) ps.close(); } catch (Exception e) {};
			try { if (connection != null) connection.close(); } catch (Exception e) {};
    	
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		} 
		
		return message;
	}

	public String addUnit() {
		
		String message = "Unit Added";
		
		try {
			
			MSSQLConnection mssqlConnection = new MSSQLConnection();
			Connection connection = mssqlConnection.getConnection();
			
			String sqlString = "INSERT " + mssqlConnection.getDatabase() + ".dbo.units " +
					"(unitNumber, rentRate, unitProperty) VALUES (?,?,?)";
			
			PreparedStatement ps = connection.prepareStatement(sqlString);
			
			ps.setString(1, unitNumber);
			ps.setInt(2, rentRate);
			ps.setInt(3, unitProperty);
			ps.executeUpdate();
			
			try { if (ps!= null) ps.close(); } catch (Exception e) {};
			try { if (connection != null) connection.close(); } catch (Exception e) {};
    	
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		} 
		
		return message;
	}

	
	// Getters & Setters
	
	public int getUnitID() {
		return unitID;
	}

	public void setUnitID(int unitID) {
		this.unitID = unitID;
	}

	public String getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}

	public int getRentRate() {
		return rentRate;
	}

	public void setRentRate(int rentRate) {
		this.rentRate = rentRate;
	}

	public int getUnitProperty() {
		return unitProperty;
	}

	public void setUnitProperty(int unitProperty) {
		this.unitProperty = unitProperty;
	}

	
}




