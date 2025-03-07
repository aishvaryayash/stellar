import java.util.*;
public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String email=s.nextLine();
		System.out.println(email);
		if(email.contains("com")|| email.contains("in")|| email.contains("net")|| email.contains("org")) {
			System.out.println("valid email address");
		}
		else {
			System.out.println("invalid email address");
			
		}

	}

}
