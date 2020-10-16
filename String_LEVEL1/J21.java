package WebT;
import java.util.*;
public class J21 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		String b[]=a.split(" ");
		for(String c:b)
		{
			int flag=0;
			for(int i=0;i<(c.length()+1)/2;i++)
			{
				if(c.charAt(i)!=c.charAt(c.length()-i-1))
				{
					flag=1;
					break;
				}
			}
			if(flag!=1)  
                                System.out.println(c);
		}
	}

}
