import java.util.*;
public class Lucky_winner {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			if(n%10 == 3 || n%10 == 8) {
				System.out.println("Luncky Winner");
			}
			else {
				System.out.println("No Luncky Winner");
				
			}

	}

}
