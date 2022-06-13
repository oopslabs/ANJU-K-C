
Q1)
package graphics;

public interface Shapes {
	void area();
	void perimeter();

}
//triangle//

package graphics;
import java.awt.Shape;
import java.util.*;
public  class Triangle {
	
	int l,b;
	public void area(int b,int h)
	{
		int area=l*b/2;
	}
	public void perimeter(int a,int b,int c){
	
	
	}
	public class Circle {
	public static void area()
	{

		Scanner b1=new Scanner(System.in);
		System.out.println("enter the radius");
	    int b = b1.nextInt();
	    System.out.println("area of the circle is"+(3.14*b*b));
	    System.out.println("perimeter of the circle is"+(2*3.14*b*b));
	}

}

	
	public static void main(String args[])
	{
		
		Scanner b1=new Scanner(System.in);
		System.out.println("enter the breadth");
	    int b = b1.nextInt();
		Scanner h1=new Scanner(System.in);
		System.out.println("enter the height");
		int h = h1.nextInt();
		System.out.println("area of the triangle is"+.5*b*h);
		Scanner a1=new Scanner(System.in);
		System.out.println("enter the fisrt side");
		int a = a1.nextInt();
		System.out.println("enter the secnd side");
		int b2 = a1.nextInt();
		System.out.println("enter the 3rd side");
		int c = a1.nextInt();

		System.out.println("perimeter of the triangle is"+(a+b2+c));
		

	}

}

//Q2)String//

package graphics;
import java.util.*;
public class Stringop {
public static void main(String args[])
	{
		String str,app;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();
		System.out.println("enter the word to be append ");
		app=sc.nextLine();
		System.out.println("new string is "+str+app);
		System.out.println("The new string is "+str.indexOf('j')+app);
		System.out.println("The new string is "+str.indexOf(1)+app);
		
			}
		}

