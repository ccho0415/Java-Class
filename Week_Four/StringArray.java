//*******************************************************
//
// Simple program for demonstrating String arrays
//
//*******************************************************

import java.util.Scanner;

public class StringArray{

  public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	String [] words = new String[4];
	System.out.println("Enter a word: ");
	words[0]=input.next()+"ay";
	for (int i=1; i<words.length;i++){
	   System.out.println("enter another word: ");
	   words[i]=input.next();
	}
	
	System.out.println("now we print the words: ");
	for (int i=0; i<words.length;i++)
	   System.out.print(words[i]+" ");
  }
}
