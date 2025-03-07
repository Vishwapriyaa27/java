package stellar;

import java.util.Scanner;

public class Oddelsecount {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String str=s.nextLine();
		int n=str.length();
		System.out.println("length of the string "+n);
		if(n%2==0) {
			System.out.println(str.charAt(((n-1)/2))+" "+str.charAt(n/2));
		}
		else {
			System.out.println(str.charAt(n/2));
		}
	}

}
