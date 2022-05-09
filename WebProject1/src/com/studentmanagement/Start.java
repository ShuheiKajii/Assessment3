package com.studentmanagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
	public static void main(String args[])throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("PRESS 1 to ADD Student");
			System.out.println("PRESS 2 to Delete Student");
			System.out.println("PRESS 3 to Display Student");
			System.out.println("PRESS 4 to Exit Student");
			int c=Integer.parseInt(br.readLine());
			
			
			if(c==1)
			{
				//ADD Student
				
				System.out.println("Enter user Name:");
				String name=br.readLine();
				
				System.out.println("Enter User class:");
				String Class=br.readLine();
				
				System.out.println("Enter User Sec:");
				String sec=br.readLine();
				
				Student st= new Student(name,Class,sec);
				boolean answer= StudentDao.insertStudentToDB(st);
				if(answer)
				{
					System.out.println("Student is added Successfully");
				}
				else {
					System.out.println("Something went wrong try again");
				}
				System.out.println(st);
				
				
						
				
			}else if(c==2)
			{
				//Delete Student
				System.out.println("Enter student id to delete:");
				int userId=Integer.parseInt(br.readLine());
				boolean f=StudentDao.deleteStudent(userId);
				if(f)
				{
					System.out.println("Deleted successfully..........");
				}else {

					System.out.println("Something went wrong---------------");
				
				}
				
			}else if(c==3)
			{
				//Display student
				
				StudentDao.ShowAllStudent();
				
			
			}else if(c==4)
			{
				
				
				break;
			}else
			{
				
			}
	

 }
  System.out.println("Thank you for using my Application");
}

	
	
}
