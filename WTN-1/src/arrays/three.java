package arrays;

public class three {
	public static void main(String args[]) {
		int a[]= {24,40,48,50,64,80};
		int k=50,f=0,i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==k) {
				f=1;
				break;
			}
		}
		if(f==0)System.out.println(-1);
		else System.out.println(i);
	}

}
