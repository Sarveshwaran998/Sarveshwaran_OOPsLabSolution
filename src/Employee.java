import java.util.*;
public class Employee extends AdminApplication{
	Scanner sc = new Scanner(System.in);
	public String getFirstName() {
		System.out.println("Enter your first name");
		String FirstName = sc.nextLine();
		return FirstName;
	}
	public String getLastName() {
		System.out.println("Enter your Last name");
		String LastName = sc.nextLine();
		return LastName;
	}
}
