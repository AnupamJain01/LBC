package WebT;
import java.util.*;
public class J16 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        for(i=0;i<=4;i++)
        {
        	String s=sc.nextLine();
        	if(s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u'||
        	s.charAt(0)=='A'||s.charAt(0)=='E'||s.charAt(0)=='I'||s.charAt(0)=='O'||s.charAt(0)=='U')
        		System.out.println(s);
        }
		
		
	}

}
