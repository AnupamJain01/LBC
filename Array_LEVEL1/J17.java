package arrayL1;
import java.util.*;
public class J17 {
public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];

        for(int i=0;i<n;i++)
                a[i]=sc.nextInt();

        count=0;
        for(int i=0;i<n;i++) 
        {
        	if(a[i]%2==0)
        	b[count++]=a[i];
        	}
        int c[]=new int[count];
        for(int i=0;i<count;i++)
        	c[i]=b[i];
        Arrays.sort(c);
        for(int i=0;i<count;i++)
        System.out.print(c[i]+" ");
	
	}

}
