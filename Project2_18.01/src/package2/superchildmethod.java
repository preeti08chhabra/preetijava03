package package2;

public class superchildmethod extends supermethod

{
	public void child1()
	{
		System.out.println("Child Default method");
	}
	public void child12(int a)
	{
		this.child13(9, 7);
		System.out.println("Child One Parameterized method");
		
	}
	public void child13(int a, int b)
	{
		super.method4(7, 6, 5);
		System.out.println("Child Two Parameterized method");
		this.child1();
	}
	public void child14(int a, int b, int c)
	{
		this.child12(7);
		System.out.println("Child Three Parameterized method");
	}
	public static void main(String[] args)
	{
		superchildmethod sch = new superchildmethod();
		sch.child14(5, 6, 7);
	}
}
