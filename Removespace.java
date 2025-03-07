package stellar;
import java.util.*;
public class Removespace {

	public static void main(String[] args) {
		String replacestr;
		String str1 = null;
Scanner s=new Scanner(System.in);
String str=s.nextLine();

		 replacestr=str.replaceAll(" ","");
	

System.out.println("Replaced after space "+replacestr);
for(int i=0;i<str.length();i++) {
	if(str.charAt(i)==' ') {
		 str1=str.replace(" ", "");
		
	}
}
System.out.println("the space removed sentence is given by "+str1);
	}

}
