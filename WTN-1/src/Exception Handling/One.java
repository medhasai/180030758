
package ExceptionHandling;
import java.util.*;

public class One {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		try
		{
			int n=Integer.parseInt(str);
			System.out.println("The square value is = "+(n*n));
			System.out.println("The work has been done successfully");
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("Entered input is not a valid format for an integer.");
		}
		sc.close();
	}

}
