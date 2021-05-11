package loops;
import java.util.Scanner;
public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

	    
        if(args.length==0){
            System.out.println("No values");
        }
        else{
            for (String v:args){
                System.out.println(v);
        }
        }
        sc.close();
	}
}