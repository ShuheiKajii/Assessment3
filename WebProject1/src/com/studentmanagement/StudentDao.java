package com.studentmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	
	
	public static boolean insertStudentToDB(Student st) {
		boolean f=false;
		
		try {
			Connection con=CP.createC();
			String q="insert into masterlistofstudent(studentname,studentclass,studentsec) values(?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			
			
			pstmt.setString(1,st.getStudentName());
			pstmt.setString(2,st.getStudentClass());
			pstmt.setString(3,st.getStudentSec());
			
			//execute
			
			pstmt.executeUpdate();
			f=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
		
		
	}

		public static boolean deleteStudent(int userId) {
			boolean f=false;
		
			try {
			Connection con=CP.createC();
			String q="delete from masterlistofstudent where studentid=?";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			
			
			pstmt.setInt(1,userId);
			//execute
			
			pstmt.executeUpdate();
			f=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
		
		
		
	}

		public static void ShowAllStudent() {
			boolean f=false;
			
			try {
			Connection con=CP.createC();
			String q="select * from masterlistofstudent";
			Statement stmt=con.createStatement();
			ResultSet set=stmt.executeQuery(q);
			while(set.next()) {
				int studentid=set.getInt(1);
				String studentname=set.getString(2);
				String studentclass=set.getString(2);
				String studentsec=set.getString(2);
				
				System.out.println("StudentId:" +studentid);
				System.out.println("StudentName:" +studentname);
				System.out.println("StudentClass:" +studentclass);
				System.out.println("StudentSec:" +studentsec);
				
				System.out.println("----------------------------------------------------------------");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
			
		}

}
