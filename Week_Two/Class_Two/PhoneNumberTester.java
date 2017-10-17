//************************************************************
// PhoneNumberTester.java
// Written by Cannon
// 
// 
// This program tests the PhoneNumber class
// ************************************************************

import java.util.Scanner;

public class PhoneNumberTester {
	
    public static void main(String[] args){

        // create a Scanner and get the phone number 
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number xxx-xxx-xxxx");
        String n=input.nextLine();

        // make a phone number object and check it		  
        PhoneNumber number=new PhoneNumber(n);
        number.check();

        // print the result
        if (number.isValid())
            System.out.println("The number you entered is a valid phone number.");
        else
            System.out.println("The number you entered is not a valid phone number.");
    
    } // end of main
}// end of class
