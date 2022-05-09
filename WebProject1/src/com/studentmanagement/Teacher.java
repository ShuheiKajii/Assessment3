package com.studentmanagement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 
	public class Teacher {
	public static void main(String args[]) {
		
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Management?userSSL=false","root","arnab@94");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from Teachers");){
			 System.out.println("-------------------------------Welcome to the Student Management Application----------------------------------------");
			 
			 System.out.println("-------------------------------Master List of all the Teachers For all the cLass---------------------------------------");
			
			while(resultSet.next()) {
				
				int SlNo =resultSet.getInt("SlNo");
				String TeacherName = resultSet.getString("TeacherName");
				String Specialization =resultSet.getString("Specialization");
				String Department = resultSet.getString("Department");
				
				System.out.println(SlNo+ "||" +TeacherName+ "||" +Specialization+ "||" +Department);
				}
		}catch(SQLException e) {
					e.printStackTrace();
		
					
				
				
			}

			
		}
	}
	