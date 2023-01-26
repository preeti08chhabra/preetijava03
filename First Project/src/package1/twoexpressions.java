// (((((10+2)+2)-2)*2)/2)
// (((((10/2)-2)+2)-2)*2)
package package1;

public class twoexpressions 
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
			twoexpressions air= new twoexpressions();
			int sumresult= air.add1(10,2);
			int sumresult2=air.add1(sumresult, 2);
			int subresult= air.sub1(sumresult2, 2);
			int mulresult= air.mul1(subresult, 2);
			int divresult= air.div1(mulresult,2);
			System.out.println("overall expression 1->(((((10+2)+2)-2)*2)/2)result is " + divresult);
			System.out.println("Execution of expression 2->(((((10/2)-2)+2)-2)*2)");
			int divresult3= air.div1(10,2);
			int subresult3= air.sub1(divresult3,2);
			int sumresult3= air.add1(subresult3,2);
			int subresult4= air.sub1(sumresult3,2);
			int mulresult3= air.mul1(subresult4,2);
			System.out.println("Overall Result of expression2->(((((10/2)-2)+2)-2)*2) is->" +mulresult3);
	}
	
	
}
