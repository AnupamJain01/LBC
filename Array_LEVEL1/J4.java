package arrayL1;

import java.util.Scanner;

public class J4 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
                 int n=sc.nextInt(),sum=0;
	         int a[]=new int[n];
	         int b[]=new int[n];

	         for(int i=0;i<n;i++)
                  a[i]=sc.nextInt();
	         for(int i=0;i<n;i++)
                  b[i]=a[i];
	         for(int i=0;i<n;i++)
                  a[n-i-1]=b[i];
	         for(int i=0;i<n;i++)
                  System.out.println(a[i]);
	
	}

}
