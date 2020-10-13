package WebT;
import java.util.*;
public class J9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		int flag=0,i;
		for(i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length())-i)
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("Not equal");
		}
		else
			System.out.println("Equal");

	}

}
