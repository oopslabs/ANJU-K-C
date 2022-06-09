package anju;
import java.util.*;
public class prgm5 {
	    public static void main(String[] args) {
	        System.out.println("Enter The number");
	        Scanner sc = new Scanner(System.in);
	        int number = sc.nextInt();
	        mult_table obj1 = new mult_table();
	        obj1.start();
	        prime obj2 = new prime(number);
	        obj2.start();
	    }
	}


