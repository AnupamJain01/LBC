package WebT;
import java.util.*;
public class J13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
                int u=0;
		String s=sc.nextLine();
		String t=sc.nextLine();
		int flag=0;
		if(s.length()<t.length())
		        u=s.length();
		else
			u=t.length();
		for(int i=0;i<u;i++)
		{
			int a =(int)s.charAt(i);
			int b=(int)t.charAt(i);
			if(a>b)
			{
				flag=1;
				System.out.println(s);
			     break;
			}
			else if(a<b)
			{
				flag=1;
				System.out.println(t);
				break;
			}
		}
		if(flag==0)
			System.out.println(s+"  "+t);
		
	}

}
