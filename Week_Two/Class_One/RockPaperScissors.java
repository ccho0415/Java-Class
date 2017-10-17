//********************************************************************
//  RockPaperScissors.java       
//  
//  Play Rock Paper Scissors with a user
//
//********************************************************************

import java.util.Scanner;

public class RockPaperScissors
{
   public static void main (String[] args){
       final int ROCK = 1, PAPER = 2, SCISSORS = 3;
       final int COMPUTER = 1, PLAYER = 2, TIE = 3;
       int computerMove;
       int playerMove;
       int again=1;
       while(again==1){
    	   int winner=-1;
           computerMove = (int) (Math.random() * 3)+1;

           System.out.println("*******************************");
           System.out.println("Welcom to Rock Paper Scissors Deathmatch! \n");
           System.out.println("Enter your choice:");
           System.out.print("1 for Rock, 2 for Paper, and 3 for Scissors: ");
           Scanner scan = new Scanner(System.in);
           playerMove = scan.nextInt();

           System.out.print ("My choice was ");

           // Determine the winner
           if(computerMove==ROCK){
        	   System.out.println ("Rock.");
        	   if (playerMove == SCISSORS)
        		   winner = COMPUTER;
        	   if (playerMove == PAPER)
        		   winner = PLAYER;
        	   if (playerMove==ROCK)
        		   winner = TIE;
           }

           if(computerMove==PAPER){
        	   System.out.println ("Paper.");
        	   if (playerMove == ROCK)
        		   winner = COMPUTER;
        	   if (playerMove == SCISSORS)
        		   winner = PLAYER;
        	   if (playerMove == PAPER)
        		   winner = TIE;
           } 
	  
           if(computerMove==SCISSORS){
        	   System.out.println ("Scissors.");
        	   if (playerMove == PAPER)
        		   winner = COMPUTER;
        	   if (playerMove == ROCK)
        		   winner = PLAYER;
        	   if (playerMove == SCISSORS)
        		   winner = TIE;
           }

           // Print results 
           if (winner == COMPUTER){
        	   System.out.println ("I win!");
           }
           if (winner == PLAYER){
        	   System.out.println ("You win!");
           }
           if (winner == TIE){
        	   System.out.println ("We tied!");
           }


           System.out.println("wanna play again? 1-yes 0-no");
           again=scan.nextInt();
       } //end while
   } // end method

} // end class
