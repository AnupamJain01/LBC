package WebT;
import java.util.*;
public class J22 {
   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
	   String s=sc.nextLine();
	   String sy[]=s.split(" ");
	   
	   for(String e:sy) {
	   for(int i=0;i<e.length()-1;i++)
	   {
		   if(e.charAt(i)==e.charAt(i+1))
		   {
			   System.out.println(e);
			   break;
			   
		   }
	   }}
   }
	
	
}
