package arrayL1;

import java.util.Scanner;

public class J15 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int n=50;
        int i,j,p;
        int a[]=new int[n+n];
        for(i=0;i<=n;i++)
          a[i]=i;
        for(i=0;i<=n;i++)
          a[i]=1;
        a[0]=0;
        a[1]=0;
        
        for(j=2;j*j<=n;j++)
        {
         if(a[j]==1)
          {
            for(p=j*2;p<=50;p+=j)
              a[p]=0;

          }
        }

      for(i=0;i<=n;i++)
      {
        if(a[i]==1)
            System.out.print(i+" ");

      }
	}

}
