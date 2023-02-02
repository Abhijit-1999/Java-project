package project20;

public class Student {
	int id;
	String name;
	long cno;
	
	Student(int id,String name,long cno)
	{
		this.id=id;
		this.name=name;
		this.cno=cno;
	}
	
	public String toString()
	{
		return "\nstudent id : "+id+"\nStudent name : "+name+"\nStudent contact number : "+cno;
	}
}


