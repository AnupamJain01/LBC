package WebT;
import java.util.*;
public class J2 {

   public static void main(String[] args) {
	
   Scanner sc = new Scanner(System.in);
   String s=" ";   
   String f=sc.nextLine();
   s+=f;
   String c="";
   for(int i=0;i<s.length();i++)
   {
	  if(s.charAt(i)==' ')
      {
			   c+=s.charAt(i+1);
	       c=c+".";
      }
   }
   for(int i=0;i<c.length()-1;i++)
   System.out.print(c.charAt(i));

	}

}
