package arrayL1;

import java.util.Scanner;

public class J7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=10;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int b[]=new int[50000];
		for(int i=0;i<n;i++)
		{
			b[a[i]]++;
		}
		int p=sc.nextInt();
		if(b[p]!=0)
			System.out.println(b[p]);
		else
			System.out.println("Not Found");
	}

}
