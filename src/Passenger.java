import java.util.*;
public class Passenger {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int max=0;
		int min=0;
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			
		}
		max=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Max value is:"+max);
		min=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Min value is:"+min);
		
		


	}

}
