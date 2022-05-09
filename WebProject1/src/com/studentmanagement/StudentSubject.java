package com.studentmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentSubject {
	
	public static void main(String args[]) {
		
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Management?userSSL=false","root","arnab@94");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from subjects");){
			 System.out.println("-------------------------------Welcome to the Student Management Application----------------------------------------");
			 
			 System.out.println("-------------------------------Master List of all the Subjects For all the cLass---------------------------------------");
			
			while(resultSet.next()) {
				
				int SlNo =resultSet.getInt("SlNo");
				String ClassName = resultSet.getString("ClassName");
				String Subject =resultSet.getString("Subject");
				String Department = resultSet.getString("Department");
				
				System.out.println(SlNo+ "||" +ClassName+ "||" +Subject+ "||" +Department);
				}
		}catch(SQLException e) {
					e.printStackTrace();
		
					
				
				
			}

			
		}
	}
	


