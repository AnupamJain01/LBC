package arrayL1;

import java.util.Scanner;

public class J14 {

	public static void main(String[] args) {
	
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int max=a[0],min=a[0],index1=0,index2=0;

      for(int i=0;i<n;i++)
      {
        if(a[i]>max)
        {
          max=a[i];
          index1=i;
        }
        if(a[i]<min) {
          min=a[i];
          index2=i;	
        }
      }
      System.out.println(max+"  "+min);
      int max1=Integer.MIN_VALUE;
      int min1=Integer.MAX_VALUE;
      for(int i=0;i<n;i++)
      {
        if(i!=index1 && a[i]>max1)
        {
          max1=a[i];

        }
        if(i!=index2 && a[i]<min1) {
          min1=a[i];

        }
      }
      System.out.println(max1+"  "+min1);
	}

}
