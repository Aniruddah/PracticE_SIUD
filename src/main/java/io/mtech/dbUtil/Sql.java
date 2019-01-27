package io.mtech.dbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Sql {
	public static void main(String[] args) throws Exception {
		
	
	DBConnection.getInstance();
	Connection con=DBConnection.getConnection();
	
    String sql = "INSERT INTO Aniruddah_Employee (Customer_ID,Customer_Name, Customer_Salary, Customer_Country,Customer_City) VALUES ( ?, ?, ?, ?, ?)";
    
    PreparedStatement statement = con.prepareStatement(sql);
    
    statement.setInt(1,3126 );
    statement.setString(2, "Luic Foncy");
    statement.setInt(3, 15000);
    statement.setString(4, "Bangladesh");
    statement.setString(5, "Dhaka");
    String sql1 = "INSERT INTO Aniruddah_Employee (Customer_ID,Customer_Name, Customer_Salary, Customer_Country,Customer_City) VALUES ( ?, ?, ?, ?, ?)";
    
    PreparedStatement statement1 = con.prepareStatement(sql1);
    
    statement.setInt(1,3127 );
    statement.setString(2, "Julia ann");
    statement.setInt(3, 20000);
    statement.setString(4, "Germany");
    statement.setString(5, "Chemnitz");
    String sql2 = "INSERT INTO Aniruddah_Employee (Customer_ID,Customer_Name, Customer_Salary, Customer_Country,Customer_City) VALUES ( ?, ?, ?, ?, ?)";
    
    PreparedStatement statement2 = con.prepareStatement(sql2);
    
    statement.setInt(1,3128 );
    statement.setString(2, "Afnan Ahmed");
    statement.setInt(3, 18000);
    statement.setString(4, "Bangladesh");
    statement.setString(5, "Sandwip");
    
     
    int rowsInserted = statement.executeUpdate();
    {
    if (rowsInserted > 0) {
    con.close();
      //  log.info("A new user was inserted successfully!");
    }
    }
	}
}
