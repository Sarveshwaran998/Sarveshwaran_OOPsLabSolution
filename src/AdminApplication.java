import java.util.*;
public class AdminApplication {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the department from the following \n1. Technical \n2. Admin \n3. Human Resource \n4. Legal");
		int option = sc.nextInt();
		switch(option) {
			case 1:
				Employee em1 = new Employee();
				Technical tech = new Technical();
				CredentialService cd1 = new CredentialService();
				String fname1 = em1.getFirstName();
				String email1 = cd1.generateEmailAddress(fname1,em1.getLastName(),tech.getTechnical());
				String password1 = cd1.generatePassword();
				cd1.showCredentials(fname1, email1, password1);
				break;
			case 2:
				Employee em2 = new Employee();
				Admin admin = new Admin();
				CredentialService cd2 = new CredentialService();
				String fname2 = em2.getFirstName();
				String email2 = cd2.generateEmailAddress(fname2,em2.getLastName(),admin.getAdmin());
				String password2 = cd2.generatePassword();
				cd2.showCredentials(fname2, email2, password2);
				break;
			case 3:
				Employee em3 = new Employee();
				HumanResource hr = new HumanResource();
				CredentialService cd3 = new CredentialService();
				String fname3 = em3.getFirstName();
				String email3 = cd3.generateEmailAddress(fname3,em3.getLastName(),hr.getHR());
				String password3 = cd3.generatePassword();
				cd3.showCredentials(fname3, email3, password3);
				break;
			case 4:
				Employee em4 = new Employee();
				Legal legal = new Legal();
				CredentialService cd4 = new CredentialService();
				String fname4 = em4.getFirstName();
				String email4 = cd4.generateEmailAddress(fname4,em4.getLastName(),legal.getLegal());
				String password4 = cd4.generatePassword();
				cd4.showCredentials(fname4, email4, password4);
				break;
		}		
	}
}
