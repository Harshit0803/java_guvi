import java.util.*;
import java.lang.*;
import java.io.*;
    class characterOrNot
    {
        public static void main(String[] args) 
        {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            System.out.print("Enter the character you want to check:");
          if((n>=65 && n <=90) || (n>=97 && n<=122))
            {
                System.out.println("character");
            }
            else
            {
                System.out.println("not a chararcter");
            }
           
        }
    }