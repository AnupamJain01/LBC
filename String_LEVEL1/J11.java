package WebT;
import java.util.*;
public class J11 {

	public static void main(String[] args) {
	
         Scanner sc = new Scanner(System.in);
         String s =sc.nextLine();
         String c="";
         int i,j,index=-1;
         for(i=0;i<s.length();i++)
          {
             if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' ||s.charAt(i)=='i' || s.charAt(i)=='I' ||
             s.charAt(i)=='o' || s.charAt(i)=='O'||s.charAt(i)=='u' || s.charAt(i)=='U')
          {
                index=i;    
                break;
          }
          }
          if(index==-1)
          System.out.println("Not Piglatin Form");
          else 
          {
          for(j=index;j<s.length();j++)
           c+=s.charAt(j);

          for(j=0;j<index;j++)
           c+=s.charAt(j);

           c+="ay";
           System.out.println(c);
           }
         
	
	}

}
    
