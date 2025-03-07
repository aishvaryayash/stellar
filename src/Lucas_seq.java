import java.util.*;
public class Lucas_seq {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		for(int i = 0; i<N; i++) {
			
			int d=a+b+c;
			a=b;
			b=c;
			c=d;
			System.out.println(d);

		}
	}

}
