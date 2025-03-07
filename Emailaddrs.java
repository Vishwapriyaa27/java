package stellar;
import java.util.*;
public class Emailaddrs {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String email=s.nextLine();
System.out.println(email);
if(email.contains(".com")||email.contains(".net")||email.contains(".org")||email.contains("@")) {
	System.out.println("valid mail address");
}
else {
	System.out.println("invalid mail address");
}
	}

}
