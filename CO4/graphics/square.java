package graphics;

import java.util.*;

public class square implements area_calc{
	public void area()
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side a:");
		a= sc.nextInt();
		String area=Double.toString(a*a);
		System.out.println("Area of the square :"+area);
	}
}
	


