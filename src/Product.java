import java.util.*;
public class Product {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size = s.nextInt();
		int[] a= new int[size];
		int product=1;
		for(int i=0; i<size; i++) {
			a[i]=s.nextInt();
			product= product*a[i];
		}System.out.println(product);


	}

}
