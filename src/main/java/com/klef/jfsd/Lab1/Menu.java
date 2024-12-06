 package com.klef.jfsd.Lab1;

import java.util.Scanner;

public class Menu {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("----------Menu----------");
			System.out.println("1.Insert Student");
			System.out.println("2.Select Student");
			System.out.println("3.Update Student");
			System.out.println("4.Delete Student");
			System.out.println("Enter Your Choice");
			int ch=sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				while(true)
				{
					System.out.println("wants to insert a detail of a student?");
					
					String ask = sc.nextLine();
					if(ask.compareToIgnoreCase("yes")==0)
					{
						System.out.print("Enter Id : ");
						int id = sc.nextInt();
						sc.nextLine();
						System.out.print("Enter Name :");
						String name = sc.nextLine();
						System.out.print("Enter Gender :");
						String gender = sc.nextLine();
						System.out.print("Enter Department :");
						String department = sc.nextLine();
						System.out.print("Enter Program :");
						String program = sc.nextLine();
						System.out.print("Enter DOB :");
						String DOB = sc.nextLine();
						System.out.print("Enter Phone :");
						String phone = sc.nextLine();
						System.out.print("Enter Graduation Status :");
						String GS = sc.nextLine();
						System.out.print("Enter CGPA :");
						Double cgpa = sc.nextDouble();
						System.out.print("Enter Number of backlogs :");
						int noblogs= sc.nextInt();
						sc.nextLine();
						InsertStudent is = new InsertStudent();
						is.insert(id,name, gender, department, program, DOB, phone, GS, cgpa, noblogs);
						System.out.println("Insert Success");
					}
					else
						break;
				}
				break;
			case 2:
				System.out.println("<--------Fetch-------->");
				System.out.print("Enter Id :");
				int id = sc.nextInt();
				sc.nextLine();
				SelectStudent ss = new SelectStudent();
				ss.select(id);
				break;
				
			case 3:
				System.out.println("<--------Update-------->");
				System.out.print("Enter Id :");
				int idu = sc.nextInt();
				sc.nextLine();
				UpdateStudent us = new UpdateStudent();
				us.update(idu);
				break;
			case 4:
				System.out.println("<--------Delete-------->");
				System.out.print("Enter Id :");
				int idd=sc.nextInt();
				sc.nextLine();
				DeleteStudent ds = new DeleteStudent();
				ds.delete(idd);
				break;
			default:
				break;
			}
		}
	}
}
