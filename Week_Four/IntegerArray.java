//*******************************************************
//
// Simple program for demonstrating integer arrays
//
//*******************************************************


public class IntegerArray{

  public static void main(String[] args){
	

	int[] numbers = new int[20];
	for (int i=0; i<numbers.length;i++)
	   numbers[i]=2*i;
		
	numbers[11]=10000001;

	for (int i=0; i<numbers.length;i++)
	   System.out.println(numbers[i]);
  }
}
