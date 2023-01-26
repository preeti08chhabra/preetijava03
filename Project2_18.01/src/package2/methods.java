package package2;

public class methods
{
 int a, b, c, d, e; // declare global variables
 
 public void method1(int a1, int b1, int c1, int d1, int e1) // declare method
 {
  a=a1;
  b=b1;
  c=c1;
  d=d1;
  e=e1;
 }
 /*public methods(int a1, int b1, int c1, int d1, int e1) // declare constructor
 {
  a=a1;
  b=b1;
  c=c1;
  d=d1;
  e=e1;
 }*/
 
 public static void main(String[] args) 
 {
	methods obj1 = new methods();
	methods obj2 = new methods();
	//methods obj3 = new methods(1,2,3,4,5);
	obj1.a=5; //assign values
	obj1.b=15;
	obj1.c=25;
	obj1.d=35;
	obj1.e=45;
	System.out.println("The value of a->"+obj1.a); //call values total calls for 1 obj1 5+5 =10 calls
	System.out.println("The value of b->"+obj1.b);// for 10 objs 10*10=100
	System.out.println("The value of c->"+obj1.c);
	System.out.println("The value of d->"+obj1.d);
	System.out.println("The value of e->"+obj1.e);
	System.out.println("way 2---Solution via using method");
	obj2.method1(10, 20, 30, 40, 50);
	System.out.println("The value of a->"+obj2.a); //call values total calls for 1 obj2 1+5 =6 calls
	System.out.println("The value of b->"+obj2.b);// for 10 objs 6*10=60
	System.out.println("The value of c->"+obj2.c);
	System.out.println("The value of d->"+obj2.d);
	System.out.println("The value of e->"+obj2.e);
 }
}
