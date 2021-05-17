  
package strings;
import java.util.*;
public class six {
	 public static void main (String[] args) throws java.lang.Exception
	    {
	        // your code goes here
	        Scanner scanner = new Scanner(System.in);
	        String a = scanner.next();
	        String b = scanner.next();
	        if(a.length() > b.length())
	        System.out.println(b+a+b);
	        else
	        System.out.println(a+b+a);
	        scanner.close();
	    }
}