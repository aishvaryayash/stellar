import java.util.*;
public class Mid_val {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int position=0;
		int length=str.length();
		if(length % 2==0) {
			position=length/2-1;
			length=2;
			System.out.println(str.substring(position,position+length));
		}
		else {
			position=length/2;
			System.out.println(str.charAt(position));
		}

	}

}
