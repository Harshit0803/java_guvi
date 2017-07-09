import java.util.*;
import java.lang.*;
import java.io.*;
class Nat_sum 
 {
 public static void main(String args[])
   {
     
            int sum = 0;
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            System.out.println("Enter Number of items :");
            for(int i=1;i<=n;i++)
            {
                sum = sum +i;
            
            }
            System.out.println(sum);
       } 
    }
