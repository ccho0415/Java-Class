import java.util.Scanner;

public class Example2
{


  public static void main(String[] args)
  {
	// First get the info from user
	Scanner input;
	input = new Scanner(System.in);
	System.out.println("Please enter a number of days: ");
        int days;
	days = input.nextInt();
	System.out.println("What's your name?");
	String name = input.next();

	// Now do calculations
	int years = days/365;
	int daysLeft = days%365;
	int weeks = daysLeft/7;
	daysLeft = daysLeft%7;

	//Now present results
	System.out.println("Thats " + years + " year(s)");
	System.out.println("and " + weeks + " week(s)");
	System.out.println("and " + daysLeft + " day(s.");

  } // end main method

} // end class
