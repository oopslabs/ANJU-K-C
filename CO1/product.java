package anju;
import java.util.*;
public class Product {
	int e=0;
	public void get()
	{
		Scanner sc=new Scanner(System.in);
		Scanner dd=new Scanner(System.in);
		Scanner ee=new Scanner(System.in);
		System.out.println("enter the product code");
		int c= sc.nextInt();
		System.out.println("Enter the product name");
		String d=dd.nextLine();
		System.out.println("enter the product price");
		int e=sc.nextInt();
		System.out.println("your product num is:"+c);
		System.out.println("your product name is:" +d);
		System.out.println("your product price is" +e);
	}
	public static void main(String[] args)
	{
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		p1.get();
		p2.get();
		p3.get();
		if(p1.e>p2.e&&p1.e>p3.e)
		{
			System.out.println("price of first is larger");
		}
		else if(p2.e>p3.e)
		{
			System.out.println("price of second is larger");
		}
		else{
			System.out.println("price of third is larger");
		}
	}

}
