package package2;

public class Newconst

{
	public Newconst()
	{
		System.out.println("Default Constructor");
	}
	public Newconst(int a, int b)
	{
		System.out.println("Parameterized Constructor");
	}
	public static void main(String[] args) 
	{
	 Newconst obj= new Newconst(45, 78);
	 Newconst obj2= new Newconst();
	}

}
