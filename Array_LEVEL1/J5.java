package arrayL1;
import java.util.*;
public class J5 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		m_sort(a,0,n-1);
		for(int i=0;i<n;i++)
			System.out.print(a[i]);
	}
	static void m_sort(int a[],int l,int r)
	{
		int m=(l+r-1)/2;
		m_sort(a,l,m);
		m_sort(a,m+1,r);
		merge(a,l,m,r);
	}
	static void merge(int a[],int l,int m,int r)
	{
		int n1=m-l+1;
		int n2=r-m;
		int L[]=new int[n1];
		int R[]=new int[n2];
		int i,j;
		for(i=0;i<n1;i++)
		{
			L[i]=a[l+i];
		}
		for(j=0;j<n2;j++)
		R[j]=a[m+j+1];
		int k=l;
		while(i<n1 && j<n2)
		{
			if(L[i]<R[j])
				a[k++]=L[i++];
			else
				a[k++]=R[j++];
		}
		while(i<n1)
		{
			a[k++]=L[i++];
		}
		while(j<n2)
		{
			a[k++]=R[j++];
		}
		
	}

}
