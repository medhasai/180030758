package strings;
import java.util.*;
public class eight {
	public String excludeHash(String stng) 
	{
	  int len = stng.length();
	  String resultString = "";
	  for (int i = 0; i < len; i++) 
	  {
	    if (i == 0 && stng.charAt(i) != '*')
	      resultString += stng.charAt(i);
	    if (i > 0 && stng.charAt(i) != '*' && stng.charAt(i-1) != '*')
	      resultString += stng.charAt(i);
	    if (i > 0 && stng.charAt(i) == '*' && stng.charAt(i-1) != '*')
	      resultString = resultString.substring(0,resultString.length()-1);
	  }
	  return resultString;
	}
	public static void main (String[] args)
	    {
	      eight m= new eight();
	      Scanner sc=new Scanner(System.in);
	      String str1 = sc.nextLine();
	      System.out.println("The new string is: "+m.excludeHash(str1));
	      sc.close();
	      }
	}