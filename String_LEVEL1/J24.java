package WebT;
import java.util.*;
public class J24 {

	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
           String a[]= {"A","B","C","D","E","F","G"};
           String c[]= {"Australia","India","America","UK","Srilanka","Paris","Switzerland"};
           String s=sc.nextLine();
           int i,index=-1;
           for(i=0;i<7;i++)
           {
        	   if(c[i].equals(s))
        	   {
        		 index=i;  
        		 break;
        	   }
           }
           if(index!=-1)
           System.out.println(a[index]);
	}

}
