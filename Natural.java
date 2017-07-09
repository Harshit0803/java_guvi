import java.util.*;
import java.lang.*;
import java.io.*;
class Natural 
 {
 public static void main(String args[])
   {
      int i = 1 ;
            int sum = 0;
            System.out.println("Enter Number of items :");
            Scanner s = new Scanner(System.in);
            int x = s.nextInt();
            while(i <= x)
            {
                sum = sum +i;
                i++;
            }
            System.out.println("Sum of "+x+" numbers is :"+sum);
       } 
    }
