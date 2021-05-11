package loops;

import java.util.Scanner;

public class one 
{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int a;
	a=sc.nextInt();
	if(a>0) {
		System.out.println("Positive");
	}
	else if(a<0) {
		System.out.println("Negative");
	}
	else {
		System.out.println("Zero");
	}
	sc.close();

}
	
}
