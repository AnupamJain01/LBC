package WebT;

import java.util.*;

public class J245 {

	public static void main(String[] args) {
		
          Scanner sc = new Scanner(System.in);
          String name[]=new String[5000];
          int marks[]=new int[5];
          int i;

          for(i=0;i<5;i++) {
          System.out.println("Enter name");
          name[i]=sc.nextLine();
          System.out.println("Enter marks");
          marks[i]=sc.nextInt();
          sc.nextLine();
          }
          int max=marks[0];
          for(i=0;i<5;i++)
          {
          if(max<marks[i])
          max=marks[i];
          }
          Arrays.sort(marks);
          String a[]=new String[50000];
          for(i=5-1;i>=0;i--)
          a[marks[i]]=name[i];

          for(i=0;i<5;i++)
          {
          System.out.println(marks[i]);
          }


          for(i=4;i>=0;i--)
          {
          if(marks[i]!=0)
          {
          System.out.println(a[marks[i]]+"  "+marks[i]);
          }
          }
	}

}
