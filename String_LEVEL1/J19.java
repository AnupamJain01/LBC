package WebT;
import java.util.*;
public class J19 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        char a[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        	a[i]=s.charAt(i);
        if((int)a[0]>97 && a[0]<122)
        {
        	a[0]-=32;
        }
	for(int i=1;i<s.length()-1;i++)
	{
		if(a[i]==' ')
			a[i+1]-=32;
			
			
	}
	for(int i=0;i<s.length();i++)
		System.out.print(a[i]);
		
	}

}
