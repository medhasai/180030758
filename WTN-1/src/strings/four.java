package strings;
import java.util.*;
public class four {
	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
	    String str = sc.nextLine();    
	    System.out.println(str.substring(0, str.length()/2));
	    sc.close();
	  } 
}