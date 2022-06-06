package graphics;

import java.util.Scanner;

public class rectangle implements area_calc{
	public void area()
	{
		int l,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length:");
		l= sc.nextInt();
		System.out.println("Enter the breadth:");
		b = sc.nextInt();
		System.out.println("Area of the rectangle : "+l*b);
	}

	}
	

