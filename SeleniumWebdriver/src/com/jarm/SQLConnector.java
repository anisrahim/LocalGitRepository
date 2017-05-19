package com.jarm;

import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;		
public class  SQLConnector {				
    	public static void  main(String[] args) throws  ClassNotFoundException, SQLException {													
    		//step1 load the driver class  
    		Class.forName("oracle.jdbc.driver.OracleDriver");  
    		  
    		//step2 create  the connection object  
    		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:niku","niku","clarity152");  
    		  
    		//step3 create the statement object  
    		Statement stmt=con.createStatement();  
           	 
           
           						
    		//step4 execute query  
    		ResultSet rs=stmt.executeQuery("select * from inv_investments where id in (5000001, 5000002)");  
    		while(rs.next())  
    		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
    		  
    		//step5 close the connection object  
    		con.close();  
    		  	
		}
}