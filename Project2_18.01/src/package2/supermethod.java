//use of Super and This Keyword in Methods
package package2;

public class supermethod
{
 
	public void method1()
	{
		System.out.println("Parent Default Method");
	}
	public void method2(int a)
	{
		this.method3(7, 8);
		System.out.println("Parent one Parametrized method");
	}
 
	public void method3(int a, int b)
	{
		this.method1();
		System.out.println("Parent Two Parametrized method");
	}
	public void method4(int a, int b, int c)
	{
		this.method2(7);
		System.out.println("Parent Three Parametrized method");
	}
}
