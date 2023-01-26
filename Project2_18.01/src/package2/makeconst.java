package package2;

public class makeconst 

{
	public makeconst()
	{
		this(9,8,7);
		System.out.println("Default Constructor");
	
	}
	public makeconst(int a)
	{
		this();
		System.out.println("One parameterized constructor");
	}
	public makeconst(int a, int b)
	{
		this(5,6,7,8);
		System.out.println("Two Parametrized Constructor");
	}
	public makeconst (int a, int b, int c)
	{
	
		System.out.println("Three Parametrized Constructor");
	}
	public makeconst(int a, int b, int c, int d)
	{
		this(10);
		System.out.println("Four parametrized constructor");
	}
	public static void main(String[] args) 
	
	{
		makeconst obj1= new makeconst(10,20);
		
		
	}
}


