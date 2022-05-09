package com.studentmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentClass {
	public static void main(String args[]) {
		
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Management?user SSL=false","root","arnab@94");
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from Classes");){
			
			System.out.println("WellCome to the Student Management Application");
			
			System.out.println("--------------------------Master list of classes-------------------------");
			while(resultSet.next()) {
			
				int SlNo=resultSet.getInt("SlNo");
				String ClassName=resultSet.getString("ClassName");
				String Section =resultSet.getString("Section");
				String Department = resultSet.getString("Department");
				
				System.out.println(SlNo+"||"+ClassName+"||"+Section+"||"+Department+"");
				}
				}catch(SQLException e) {
				e.printStackTrace();
			}
		
		
	}

}
