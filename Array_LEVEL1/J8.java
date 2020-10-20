package arrayL1;

import java.util.Scanner;

public class J8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int p=sc.nextInt();
		int aa=b_search(a,p,0,n-1);
		if(aa==-1)
			System.out.println("Not Found");
		else
			System.out.println(aa);
	}
	static int b_search(int a[],int p,int l,int r) {
		if(r>=l) {
		int m=l+(r-l)/2;
                if(p==a[m])
                    return m;
                if(p<a[m])
                    return b_search(a,p,l,m-1);
                if(p>a[m])
                    return b_search(a,p,m+1,r);
	     
		}
		
		
		
		
		
		return -1;
		
	}

}
