/* Computes the average of a set of values entered by the user.
   The running sum is printed as the numbers are entered. 
   Original program from Lewis and Loftus, modified  by cannon    */

import java.util.Scanner;

public class Average

{
   public static void main (String[] args)
   {
      int sum = 0, value;
      double average,count=0.0;
      Scanner scan = new Scanner (System.in);
      System.out.print ("Enter number of tests ");
      count = scan.nextDouble();

      for(int i=1;i<=count;i++)
      {
          System.out.println("Now enter a score:");
          value = scan.nextInt();
          sum +=value;
          System.out.println ("The sum so far is " + sum);
      }
      System.out.println ();
      if (count == 0)
          System.out.println ("No values were entered.");
      else
      {
          average = sum / count;
          System.out.println ("The average is " + average);
      }

   }

}


