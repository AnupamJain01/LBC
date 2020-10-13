package WebT;

import java.util.Scanner;

public class J6 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);   
	String s =sc.nextLine();
	String m=sc.nextLine();
       
	int  flag=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=m.charAt(i))
			flag=1;
	}
	if(flag==1)
	System.out.println("Not equal");
	else
    System.out.println("Equal");
            
	}

}
