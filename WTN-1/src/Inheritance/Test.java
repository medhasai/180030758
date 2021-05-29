package inheritance;


import java.util.*;

public class Test {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String dob=sc.nextLine();
		double salary=sc.nextDouble();
		String subject=sc.next();
		int studentid=sc.nextInt();
		String collegename=sc.next();
		Person1 p=new Person1(name,dob);
		Teacher t=new Teacher(name,dob,salary,subject);
		Student s=new Student(name,dob,studentid);
		Collegestudent cs=new Collegestudent(name,dob,studentid,collegename);
		System.out.println(p);
		System.out.println(t);
		System.out.println(s);
		System.out.println(cs);
		sc.close();
	}
}