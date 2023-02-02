package project20;


	import java.util.ArrayList;
	import java.util.Scanner;
	public class School {
		
		Student s;
		ArrayList<Student> al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		
		public void addStudent()
		{
			System.out.println("Enter Student Id: ");
			int id=sc.nextInt();
			System.out.println("Enter name : ");
			String name = sc .next();
			System.out.println("Enter contact number : ");
			long num=sc.nextLong();
			
			s= new Student(id,name,num);
			al.add(s);
			System.out.println("Student added successfully...");
		}
		
		public void displayStudent()
		{
			System.out.println("Enter your id...");
			int no=sc.nextInt();
			
			for(Student s : al)
			{
				if(no==s.id)
				{
					System.out.println(s);
					return;
				}
			}
			System.out.println("Student not found....");
		}
		
		public void removeStudent()
		{
			System.out.println("Enter the id of student you want to remove ??");
			int id=sc.nextInt();
			
			for(Student s : al)
			{
				if(id==s.id)
				{
					al.remove(s);
					System.out.println("Student removed....");
					return;
				}
			}
			System.out.println("Student not found...");
		}
		
		public void updateName()
		{
			System.out.println("enter the id of student whose name is to be updated  ??");
			int id=sc.nextInt();
			for(Student s : al)
			{
				if(id==s.id)
				{
					System.out.println("enter the new name u want to update ");
					String upname=sc.next();
					s.name=upname;
					System.out.println("name updated...");
					return;
				}
			}
			System.out.println("Student not found...");
		}
		
	}

