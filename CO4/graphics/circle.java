package graphics;

import java.util.Scanner;

public class circle implements area_calc{
	int r;
	public void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		r=sc.nextInt();
		String area=Double.toString(Math.PI*r*r);
		System.out.println("area of the circlr is:"+area);
		sc.close();
		
		
	}
	


}
