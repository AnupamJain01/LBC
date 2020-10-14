package WebT;

import java.util.Scanner;

public class J12 {

public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);   
    String s =sc.nextLine();

    if(s.charAt(0)=='m' && s.charAt(1)=='r' && s.charAt(2)=='s' && s.length()>2)
      System.out.println("Married Female");	 
    else if(s.charAt(0)=='m' && s.charAt(1)=='r'&& s.length()>=2)
      System.out.println("Male");
    else if(s.charAt(0)=='m' && s.charAt(1)=='i' && s.charAt(2)=='s' && s.charAt(3)=='s' && s.length()>=4)
      System.out.println("Female");	
    else if(s.charAt(s.length()-1)=='i' && s.charAt(s.length()-2)=='r' && s.charAt(s.length()-3)=='a' && s.charAt(s.length()-4)=='m'&& 
      s.charAt(s.length()-5)=='u' && s.charAt(s.length()-6)=='k')
      {
      System.out.println("Female");	
      }
    else
      System.out.println("Cannot Determine");
		
	}

}
