package graphics;
import java.util.*;
public class triangle implements area_calc{
	public void area()
	{
	int b,h;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the breadth:");
	b= sc.nextInt();
	System.out.println("Enter the height:");
	h = sc.nextInt();
	String area=Double.toString(h*b/2f);
	System.out.println("Area of the triangle: "+area);
}
}

