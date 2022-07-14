package anju;
import java.util.*;
public class numbers {
	public void calc()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		System.out.println("square of the number is:"+(n*n));
		System.out.println("cube of the number is:"+(n*n*n));
	}
	public static void main(String[] args)
	{
		numbers obj1=new numbers();
		obj1.calc();
	
	}
	}

