package WebT;
import java.util.*;
public class J7 {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
        String S=sc.nextLine();
        String a[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        if(S.equals("Monday"))
        	System.out.println("1");
        else if(S.equals("Tuesday"))
        	System.out.println("2");
        else if(S.equals("Wednesday"))
        	System.out.println("3");
        else if(S.equals("Thursday"))
        	System.out.println("4");
        else if(S.equals("Friday"))
          System.out.println("5");
        else if(S.equals("Saturday"))
          System.out.println("6");
        else if(S.equals("Sunday"))
          System.out.println("0");
        else {
          try {
          int i=(Integer.valueOf(S));
          System.out.println(a[i]);
          }
          catch(Exception e)
          {
            System.out.println("Please give number");
          }
          }
	}

}
