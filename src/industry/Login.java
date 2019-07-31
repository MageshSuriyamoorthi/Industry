package industry;

import java.util.Scanner;

public class Login {
	public static void login() throws CustomException1 {
		Scanner scan = new Scanner(System.in);
		String Sector = "Finance";
		String SectorPasswrd = "a4.asd@123";
		System.out.println("enter username");
		String user_name1 = scan.nextLine();
		System.out.println("enter password");
		String password1 = scan.nextLine();
		if (Sector.equals("Finance") && SectorPasswrd.equals("a4.asd@123")) {
			System.out.println("login successfully");
			EmpMenu Emp = new EmpMenu();
			Emp.Menu();
		} else {
			System.out.println("Username or password is Incorrect type valid username or password");
			login();
		}
	}
}
