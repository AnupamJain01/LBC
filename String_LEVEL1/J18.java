package WebT;
import java.util.*;
public class J18 {

    public static void main(String[] args) {
	
    Scanner sc=new Scanner(System.in); 
    String s=sc.nextLine();
    s.toLowerCase();
    int a[]=new int[400];
    int i;
    for(i=0;i<s.length();i++)
    {
      int index=(int)s.charAt(i);
      a[index]++;
    }
    for(i=65;i<140;i++)
    {
      if(a[i]>0)
      System.out.println((char)i+"  "+a[i]);
    }
            	
	}

}
