package strings;
import java.util.*;
public class ten {
	public static String repeatEnd(String str, int n) {
		  int len = str.length();
		  String newWord = "";
		  for (int i = 0; i < n; i++) {
		    newWord += str.substring(len - n, len);
		  }
		  return newWord;
		}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    String str = sc.nextLine();  
	    int n=sc.nextInt();
	    System.out.print(repeatEnd(str, n));
	    sc.close();
	}
}