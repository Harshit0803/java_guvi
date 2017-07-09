import java.util.*;
import java.lang.*;
import java.io.*;
class OddOrEven
{
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
     int x = sc.nextInt();
      System.out.println("Enter an integer to check if it is odd or even ");
 
      if ( x % 2 == 0 )
         System.out.println("You entered an even number.");
      else
         System.out.println("You entered an odd number.");
   }
}