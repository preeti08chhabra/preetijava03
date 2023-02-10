//Use of this and Super Keyword in Constructor
package package2;

public class superchildconst extends superconst
{

	public superchildconst()
	{
		this(7,9);
		System.out.println("Default Child Constructor");
		
	}
	public superchildconst(int a)
	{
		this(8,9,10);
		System.out.println("One Parameterized Child Constructor");
	}
	public superchildconst(int a, int b)
	{
		super(7,9);
		System.out.println("Two Parameterized Child Constructor");
	}
	public superchildconst(int a, int b, int c)
	{
		this();
		System.out.println("Three Parameterized Child Constructor");
	}
	public static void main(String[] args)
	{
		superchildconst ch = new superchildconst(5);
	}
}
