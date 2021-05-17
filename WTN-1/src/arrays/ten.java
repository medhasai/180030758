package arrays;

import java.util.Scanner;

public class ten {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         int[] arr[]=new int[3][3];
         for(int i=0;i<3;i++)
 	    {
 	        for(int j=0;j<3;j++)
 	        {
 	            
 	        arr[i][j]=sc.nextInt();
 	       
 	        }
 	        
 	    }
        
         int max=Integer.MIN_VALUE;
          System.out.println("The given array is:");
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    if(arr[i][j]>max)
                        max=arr[i][j];
                System.out.print(arr[i][j]+" ");
                }
                System.out.println();

            }
            System.out.println("the maximum value is "+max);
            sc.close();
	}

}
