package graphics;
import java.util.*;
import graphics.circle;
import graphics.rectangle;
import graphics.triangle;
import graphics.square;
public class driver {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int ch;
		circle obj1 = new circle();
		rectangle obj2 = new rectangle();
		square obj3 = new square();
		triangle obj4 = new triangle();
		System.out.println("Choose : 1)Circle 2)Rectangle 3)Square 4)Triangle");
		System.out.println("");
		ch = sc.nextInt();
		switch(ch) {
		case 1: obj1.area();
		break;
		case 2: obj2.area();
		break;
		case 3: obj3.area();
		break;
		case 4: obj4.area();
		break;
		}
		
	}
}