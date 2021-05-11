package arrays;
import java.util.Scanner;
public class four {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		char ch=0;
		int i;
		for(i=0;i<n;i++) {
			ch=(char)a[i];
			System.out.print(ch);
		}
		sc.close();
	}
}