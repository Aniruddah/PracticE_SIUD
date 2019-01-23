package io.mtech.dbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Sql {
	public static void main(String[] args) throws Exception {
		
	
	DBConnection.getInstance();
	Connection con=DBConnection.getConnection();
	
    String sql = "INSERT INTO T_AniruddahN (C_Name, C_Salary, Country,City,Zip_Code) VALUES ( ?, ?, ?, ?, ?)";
    
    PreparedStatement statement = con.prepareStatement(sql);
    statement.setInt(1, 01);
    statement.setString(1, "Foncy");
    statement.setInt(2, 15000);
    statement.setString(3, "Bangladesh");
    statement.setString(4, "Dhaka");
    statement.setInt(5, 1100);
     
    int rowsInserted = statement.executeUpdate();{
    if (rowsInserted > 0) {
    con.close();
        System.out.println("A new user was inserted successfully!");
        
   
    }
    
}
    
    
    
    
}
}


