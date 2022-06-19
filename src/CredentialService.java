import java.util.*;
public class CredentialService extends AdminApplication{
	public String generatePassword() {
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$%&";
	      String numbers = "1234567890";
	      String combinedCharacters = capitalCaseLetters+lowerCaseLetters+specialCharacters+numbers;
	      Random rnd = new Random();
	      char c = capitalCaseLetters.charAt(rnd.nextInt(capitalCaseLetters.length()));
	      char d = lowerCaseLetters.charAt(rnd.nextInt(lowerCaseLetters.length()));
	      char e = specialCharacters.charAt(rnd.nextInt(specialCharacters.length()));
	      char f = numbers.charAt(rnd.nextInt(numbers.length()));
	    StringBuilder sb = new StringBuilder(8);
        for (int i = 0; i < 4; i++)
            sb.append(combinedCharacters.charAt(rnd.nextInt(combinedCharacters.length())));
        String pwd = sb.toString()+c+d+e+f;
        return pwd;
	   }
	public String generateEmailAddress(String fname, String lname, String department) {
		String email = fname+lname+"@"+department+".abc.com";
		return email;
	}
	public void showCredentials(String fname, String email, String password2) {
		System.out.println("Dear "+fname+" your generated credentials are as follows \nEmail    --> "+email+"\nPassword --> "+password2);
	}
}