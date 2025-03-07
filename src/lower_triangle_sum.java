import java.util.*;
public class lower_triangle_sum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int n=s.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j) {
					sum1=sum1+a[i][j];
				}
				if(i==j) {
					sum2=sum2+a[i][j];
				}
				if(i<=j) {
					sum3=sum3+a[i][j];
					}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("sum of lower:"+sum1);
		System.out.println("sum of diagonal:"+sum2);
		System.out.println("sum of upper:"+sum3);
	}

}