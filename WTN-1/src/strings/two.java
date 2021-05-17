package strings;
import java.util.*;
public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    String str1=sc.nextLine();
	    String str2=sc.nextLine();

	if( str1.substring( str1.length()-1).equalsIgnoreCase( str2.substring(0,1)) )
	                    System.out.println(  str1.concat( str2.substring(1, str2.length())).toLowerCase() );
	                else
	                    System.out.println(  str1.concat( str2) );
	sc.close();
	}

}