package ExceptionHandling;

import java.util.*;
public class Two {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array\n");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements in the array\n");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the index of the array element you want to access\n");
		int b=sc.nextInt();
		try
		{
			for(int i=0;i<n;i++)
			{
				if(i==b)
				{
					System.out.println("The array element at index "+b+" = "+a[i]);
					System.out.println("The array element successfully accessed");
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		sc.close();
	}
}
