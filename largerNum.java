import java.util.*;
import java.lang.*;
import java.io.*;
    class largerNum
    {
        public static void main(String[] args) 
        {
            Scanner s = new Scanner(System.in);
            int n1=s.nextInt();
            System.out.print("Enter the 1st no");
             Scanner s1= new Scanner(System.in);
            int n2=s1.nextInt();
            System.out.print("Enter the 2nd no");
             Scanner s2=new Scanner(System.in);
            int n3=s2.nextInt();
	     System.out.print("Enter the 3rd no");
           // System.out.print("Enter the character you want to check:");
          if((n1>n2)&&(n1>n3))
            {
                System.out.println(n1 + "is greatest");
            }
            else if((n2>n3)&&(n2>n1))
            {
                System.out.println(n2 + "is greater");
            }
          else 
           System.out.println(n3 + "is greater");
        }
    }