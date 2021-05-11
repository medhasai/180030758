package arrays;

import java.util.Scanner;

public class one {
	public static void main(String args[]) {
		int n,a[],sum=0;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		avg=sum/n;
		System.out.println("Sum of array is "+sum);
		System.out.println("Average of array is "+avg);
		sc.close();
	}
}


