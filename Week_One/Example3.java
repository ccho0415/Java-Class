// ******************************************
// Converter program
// written by Cannon
// 
// prints the message converts days to weeks
// *******************************************


import java.util.Scanner;

public class Example3
{

  public static void main(String[] args)
  {

    // make a scanner called input
    Scanner input = new Scanner(System.in);
    System.out.println("Your name please");
    String name = input.nextLine();

    // get a number from the user
    System.out.println("give me a (integral) number of days "+name);
    int  days;
    days = input.nextInt();
    
    // limit the size of the number
    while (days>10000000)
    {
	System.out.println("This number boggles mind!");
	System.out.println("Please enter something more managable");
	days = input.nextInt();
    }
    
    // do the calculations 
    int weeks = days/7;
    int leftover = days%7;

    // print the results
    System.out.println("that is " + weeks + " week(s)");
    System.out.println("and " + leftover + " day(s)");
  
  } // end of the main method

}// end of the class
