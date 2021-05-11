package arrays;
import java.util.Scanner;
public class nine {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Please enter 4 integer numbers: ");
		    int i,j;
			  int n=sc.nextInt();
			  int a[][]=new int[n][n];
			  for(i=0;i<n;i++)
			  {
			      for(j=0;j<n;j++)
			      {
				  a[i][j]=sc.nextInt();
			      }
			  }
			  System.out.println("The given array is :");
			  for(i=0;i<n;i++)
			  {
			  for(j=0;j<n;j++)
			  {
			      System.out.print(a[i][j]+" ");
			  }
			  System.out.print("\n");
			  }
			  System.out.println("The reverse of the array is :");
			   for(i=n-1;i>=0;i--)
			  {
			  for(j=n-1;j>=0;j--)
			  {
			      System.out.print(a[i][j]+" ");
			  }
			  System.out.print("\n");
			  }
			   sc.close();

	}
}