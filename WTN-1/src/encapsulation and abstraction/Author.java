package eanda;

import java.util.*;

class TAuthor {
	private String name;
	private String email;
	private char gender;
	public TAuthor(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	 public String getName() {
	      return name;
	   }
	   public String getEmail() {
	      return email;
	   }
	   public char getGender() {
		      return gender;
		   }
	   public void setEmail(String email) {
	      this.email = email;
	   }
	   public String toString() {
	      return name + " (" + gender + ") at " + email;
	   }
}

public class Author {
	   public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter name = ");
		   String name=sc.nextLine();
		   System.out.println("Enter Email = ");
		   String email=sc.nextLine();
		   System.out.println("Enter Gender = ");
		   char gender=sc.next().charAt(0);
	      TAuthor ahTeck = new TAuthor(name, email, gender);
	      System.out.println(ahTeck);
	      System.out.println("name is: " + ahTeck.getName());
	      System.out.println("gender is: " + ahTeck.getGender());
	      System.out.println("email is: " + ahTeck.getEmail());
	      sc.close();
	   }
	}
