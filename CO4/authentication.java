package anju;
import java.util.*;

public class authentication {
	public static void main(String args[]) {
		String usr = "anjukc23";
		String pass = "112233";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String username = sc.nextLine();
		System.out.println("Enter Password");
		String password = sc.nextLine();
		try {
			if((username.equals(usr)) && (password.equals(pass))){
				System.out.println("Access Granted");
			}
			else {
				throw new co4_prgm3("Invalid Credentials");
			}
		}catch(co4_prgm3 e) {
			System.out.println(e.getMessage());
		}
		
	}
}
