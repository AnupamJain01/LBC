package arrayL1;

import java.util.Scanner;

public class J6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=10;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int p=sc.nextInt();
		int flag=1;
		int i;
		for(i=0;i<n;i++)
		{
			if(a[i]==p)
			{
				flag=0;
				break;
			}
		}
		if(flag==0)
			System.out.println(i+1);
		else
			System.out.println("Not Found");
		
	}

}
