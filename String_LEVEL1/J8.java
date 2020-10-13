  package WebT;
  import java.util.*;
  public class J8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int i;
        char c[]=new char[s.length()];
        for(i=0;i<s.length();i++)
        {
          c[i]=s.charAt(i);
        }



        for(i=0;i<s.length();i++)
        {
          if(c[i]>=65 && c[i]<=90)
            { 
            int a=c[i];
            c[i]=(char)(a+32);
            }
          else if(c[i]>=97 && c[i]<=122)
            { 
            int a=c[i];
            c[i]=(char)(a-32);
            }
        }
        for(i=0;i<s.length();i++)
        {
          System.out.print(c[i]);
        }

    }

  }
