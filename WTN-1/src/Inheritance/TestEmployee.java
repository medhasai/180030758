package inheritance;

import java.util.*;


public class TestEmployee {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String person=sc.nextLine();
		String empn=sc.nextLine();
		double a=sc.nextDouble();
		int y=sc.nextInt();
		String i=sc.nextLine();
		Person p=new Person(person);
		Employee e=new Employee(empn,a,y,i);
		System.out.println(p);
		System.out.println(e);
		sc.close();
	}
}