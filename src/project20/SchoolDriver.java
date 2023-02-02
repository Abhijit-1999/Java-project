package project20;

import java.util.Scanner;

public class SchoolDriver {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		School sc=new School();
		
		boolean exit=true;
		
		while(exit)
		{
			System.out.println("Enter Your Choice:\n1.Add a student \n2.Display student details \n3.Remove student \n4.Update name \n5.Exit");
			int choice=s.nextInt();
			switch(choice)
			{
			case 1:
			{
				sc.addStudent();
				break;
			}
			
			case 2 :
			{
				sc.displayStudent();
				break;
			}
			case 3 :
			{
				sc.removeStudent();
				break;
			}
			case 4 :
			{
				sc.updateName();
				break;
			}
			case 5:
			{
				exit=false;
				System.out.println("Thank You For Using this application:)");
				break;
			}
			
			default:
				System.out.println("invalid Choice! Try Again LATER!");
			
			}
		}
	}


}



