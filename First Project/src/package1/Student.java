package package1;

public class Student 

{
	int age;
	int rollno;
	
	public void display1()
	{
		System.out.println("Welcome all of you");
	}
	public void diplay2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args)
	
	{
		Student stu=new Student();
		stu.age=15;
		stu.rollno=901;
		System.out.println("The age is->" +stu.age);
		System.out.println("The rollno is->" +stu.rollno);
		stu.display1();
		stu.diplay2();
	}

}
