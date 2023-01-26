package package1;

public class Arithmatic 
{
public int add1(int a, int b)

{
	int add = a+b;
	System.out.println( "The addition is " +add);
	return add;
}
public int sub1(int c, int d)
{
	int sub= c-d;
	System.out.println("The Subtraction is "+sub);
	return sub;
	
}

public int mul1(int a1, int b1)
{ 
	int mul= a1*b1;
	System.out.println("The multiplication is " +mul);
	return mul; 
}
public int div1(int a2, int b2)
{
	int div= a2/b2;
	System.out.println("The Division is " +div);
	return div;
}
	public static void main(String[] args) 
	
{
		Arithmatic air= new Arithmatic();
		int sumresult= air.add1(5, 7);
		int subresult= air.sub1(9, 4);
		int mulresult= air.mul1(5, 6);
		int divresult= air.div1(10,2);
		
}
		// TODO Auto-generated method stub

	

}
