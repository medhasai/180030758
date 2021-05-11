package loops;
import java.util.Scanner;
public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        char n = sc.next().charAt(0);
        int a=(int)c;
        int b=(int)n;
        if(a<b){
            System.out.println(c+" "+n);
        }
        else{
            System.out.println(n+" "+c);
        }
        sc.close();
	}

}