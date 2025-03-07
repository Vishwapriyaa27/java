package stellar;

import java.util.Scanner;

public class Strcls {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("enter a string");
		String str=s.nextLine();
		String str1=str.toLowerCase();
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u') {
				count++;}}
				System.out.println(count);
					
		
		
	}

}
