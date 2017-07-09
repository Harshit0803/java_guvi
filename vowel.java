import java.util.*;
import java.lang.*;
import java.io.*;
    class vowel
    {
        public static void main(String[] args) 
        {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            System.out.print("Enter the character you want to check:");
            if(n == 'a' || n == 'e' || n == 'i' || n=='o' || n=='u' || n=='A' || n=='E' || n=='I' ||n== 'O' || n == 'U')
            {
                System.out.println("The given caharacter "+n+" is a Vowel");
            }
            else
            {
                System.out.println("The given character "+n+" is Constant");
            }
           
        }
    }