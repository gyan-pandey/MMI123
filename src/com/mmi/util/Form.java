package com.mmi.util;
import java.sql.*;


public class Form {
	
	public static void main(String[] args)
	{
	try {
		
	Connection connection  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mmi", "postgres" , "postgres");

//	Class.forName("org.postgresql.Driver");  
	
	
	Statement statement = connection.createStatement();
	
	
	
//	statement.executeUpdate("create table employee ( eid integer , fName varchar(10) , lName varchar(10) , email varchar(20))");
	   
	
	
	System.out.printf("%-30.30s  %-30.30s %-30.30s  %-30.30s%n" ,"eid" ,"fName","lName","email");
	//statement.executeUpdate("insert into employee values('1','sagar','sa','sa@gmail.com')");
	
	/*statement.executeUpdate("insert into employee values('2','mangal','pandey','mangal@gmail.com')");
	statement.executeUpdate("insert into employee values('3','gyan','pandey','gyan@gmail.com')");
	statement.executeUpdate("insert into employee values('4','suraj','null','suraj@gmail.com')");
	statement.executeUpdate("insert into employee values('5','priya','jindal','priya@gmail.com')");
	statement.executeUpdate("insert into employee values('6','ashank','mishra','ashank@gmail.com')");
	statement.executeUpdate("insert into employee values('7','sarvagya','null','sarvagya@gmail.com')");*/
	
	
	//statement.executeUpdate("update employee set lName = 'kumar' where eid = '1'");
	
	
//	statement.executeUpdate("delete from employee where eid ");
//  ResultSet resultSet = statement.executeQuery("select * from employee");
 // ResultSet resultSet = statement.executeQuery("select * from employee order by eid asc");
	ResultSet resultSet = statement.executeQuery("select * from employee where fName like '__a%'");
	
	
//	ResultSet resultSet =statement.executeQuery("select distinct eid, fName from employee where eid= '1' ");
	
	
	
	
	while(resultSet.next())
		System.out.printf("%-30.30s  %-30.30s %-30.30s  %-30.30s%n",resultSet.getString("eid"),resultSet.getString("fName"),resultSet.getString("lName"), resultSet.getString("email"));
	   //   System.out.println(resultSet.getString("eid")+"   "+resultSet.getString("fName"));
	
		
	}
//	catch(ClassNotFoundException e)
//	{
//		System.out.println("connection failure1");
//		e.printStackTrace();
//	}
	catch(SQLException e)
	{
		System.out.println("connection failure");
		e.printStackTrace();
	}
	

}
}
