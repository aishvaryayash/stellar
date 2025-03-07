import java.util.*;
public class Triangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		int angle = n1+n2+n3;
		if(angle == 180) {
			if((n1 == 90) || (n2 == 90) || (n3 == 90)) {
				System.out.println("Prize 2");
				}
			else if((n1 == 60) && (n2 == 60) && (n3 == 60 )) {
				System.out.println("Prize 3");
			}
			else {
				System.out.println("Prize 1");
			}
		}
		else {
			System.out.println("No prize");
		}		


	}

}
