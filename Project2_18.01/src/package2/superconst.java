//Use of this and Super Keyword in Constructor

package package2;

public class superconst 
{
	public superconst()
	{
		this(8,9,2);
		System.out.println("Default Parent Const");
	
	}
	public superconst(int a)
	{
		this();
		System.out.println("One Parametrized Parent Const");
	}
	public superconst(int a, int b)
	{
		this(4);
		System.out.println("Two Parametrized Parent Const");
	}
	public superconst(int a , int b, int c)
	{
		System.out.println("Three Parametrized Parent Const");
	}
	public static void main(String[] args) {
		superconst sc = new superconst(2,4,6);
 	}
}
