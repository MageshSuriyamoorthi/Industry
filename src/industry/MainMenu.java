package industry;

public class MainMenu {
	public static void main(String[] args) {
		Login login = new Login();
		System.out.println("EMPLOYEE MANAGEMENT");
		try {
			Login.login();
		} catch (CustomException1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
