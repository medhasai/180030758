package loops;
import java.util.Scanner;
public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if((c>=65 && c<=90) || (c>=97 && c<=122)){
            System.out.println("alphabet");
        }
        else if((c>=33 && c<=47) || (c>=91 && c<=96) || (c>=123 && c<=126)){
            System.out.print("Special Character");
        }
        else{
            System.out.print("Digit");
        }
        sc.close();
	}

}