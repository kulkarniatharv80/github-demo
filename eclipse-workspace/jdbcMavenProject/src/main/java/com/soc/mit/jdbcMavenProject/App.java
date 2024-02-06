package com.soc.mit.jdbcMavenProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        System.out.println( "Hello World!" );
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("driver loaded");
        String url="jdbc:mysql://localhost:3306/EmployeeDb";
        String uname="root";
        String pwd="root6514";
        Connection con = DriverManager.getConnection(url,uname,pwd);
        System.out.println("connection established");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from employee");
        while(rs.next()) {
        	System.out.println("Ename="+rs.getString(1));
        	System.out.println("Eid="+rs.getInt(2));
        	System.out.println("Esal="+rs.getDouble(3));
        	
        }
        
//        PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
//        ps.setString(1,"amit");
//        ps.setInt(2,564);
//        ps.setDouble(3,85000);
//        ps.executeUpdate();
//        System.out.println("row inserted");
//        rs=st.executeQuery("select * from employee");
        
//        PreparedStatement ps=con.prepareStatement("Update employee set ename=? where eid=?");
//        ps.setString(1, "Amit kumar");
//        ps.setInt(2, 564);
//        ps.executeUpdate();
//        System.out.println("row updated successfully");
//        System.out.println("**************************");
//        rs=st.executeQuery("select * from employee");
        
        PreparedStatement ps=con.prepareStatement("Delete employee set ename=? where eid=?");
        ps.setString(1, "Amit ");
        ps.setInt(2, 564);
        ps.executeUpdate();
        System.out.println("row updated successfully");
        System.out.println("**************************");
        rs=st.executeQuery("select * from employee");
        
        while (rs.next())
        {
        	System.out.println("Ename="+rs.getString(1));
        	System.out.println("Eid="+rs.getInt(2));
        	System.out.println("Esal="+rs.getDouble(3));
        }
        
        	
        	
        	
    }
}
