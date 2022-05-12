package anju;

import java.util.Scanner;

class book
{
	String bname,id;
	
	book()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book name");
		bname=sc.nextLine();
		System.out.println("enter book id");
		id=sc.nextLine();
		
	}
}
class publisher extends book
{
	String pname,edition;
	publisher()
	{
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter publisher name");
		pname=sc.nextLine();
		System.out.println("enter edition");
		edition=sc.nextLine();
	}
	
}
class fiction extends publisher
{
	String genre,author;
	float price;
	fiction()
	{
	
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter author");
		author=sc.nextLine();
		System.out.println("enter genre");
		genre=sc.nextLine();
		System.out.println("enter price");
		price=sc.nextInt();
	}
	void display()
	{
		System.out.println("Book name "+bname);
		System.out.println("Book id "+id);
		System.out.println("Book author "+author);
		System.out.println("Book genre "+genre);
		System.out.println("Book price "+price);
	
	}
	
}
class literature extends publisher
{
	String genre,author;
	float price;
	literature()
	{
		
		super();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter author");
		author=sc.nextLine();
		System.out.println("enter genre");
		genre=sc.nextLine();
		System.out.println("enter price");
		price=sc.nextInt();
	}
	void display()
	{
		System.out.println("Book name "+bname);
		System.out.println("Book id "+id);
		System.out.println("Book author "+author);
		System.out.println("Book genre "+genre);
		System.out.println("Book price "+price);
	
	}
  }
