//*****************************
// This class rules!!
//*****************************

import java.util.Scanner;

public class Grades{

    public static void main(String[] args){

	// make scanner and get input
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your score???");
	double score = scan.nextDouble();

	// determine grade
	String grade="INC";
	if(score>=90)
	    grade = "A";
	if(score>=80 && score<90)
	    grade = "B";
	if(score<80)
	    grade="F";

	// print the results
	System.out.println("Your grade is " + grade);
	if (grade.equals("A"))
	    System.out.println("Dude, you totally rule!");
    }//end main method

}// end of the class

