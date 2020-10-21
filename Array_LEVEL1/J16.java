package arrayL1;
import java.util.*;
public class J16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
                    int n=sc.nextInt();
	            int a[]=new int[500000];
	            for(int i=0;i<n;i++)
	                a[i]=sc.nextInt();
	            int b[]=new int[500000];
	            for(int i=0;i<n;i++)
	            	b[a[i]]++;
	            for(int i=0;i<500000;i++)
	            {
	            	if(b[a[i]]==1)
	            		System.out.print(a[i]+" ");
	            }
	}
}
