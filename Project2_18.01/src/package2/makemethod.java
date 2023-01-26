package package2;

public class makemethod 

{
	public void method1()
	{
		System.out.println("Default method");
		this.method2(7);
	}
	public void method2(int a)
	{
		System.out.println("One Parametrized Method");
		this.method4(8,9,7);
	}
	public void method3(int a, int b)
	{
		System.out.println("Two Parametrized Method");
	}
	public void method4(int a, int b, int c)
	{
		System.out.println("Three Paarmetrized Method");
		this.method3(5,9);
	}
	public void method5(int a, int b, int c, int d)
	{
		System.out.println("Four parametrized Method");
		this.method1();
	}
	public static void main(String[] args) 
	{
		makemethod obj=new makemethod();
		obj.method5(6,7,8,9);
	}
}
