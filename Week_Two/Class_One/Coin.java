//************************************
//
//  Coin.java
//
//  This class models a coin
//  for flipping
//
//  Originally by Lewis and Loftus
//  modified by Cannon
//************************************





public class Coin
{

 private int face;
 private double threshold;
 public final int HEADS=0;
 public final int TAILS=1;

 public Coin()
 {
    threshold=.5;
    flip();
 }

 public Coin(double t){
    threshold=t;
    flip();
 }
 

 public void flip()
 {
    	if (Math.random()<.threshold)
	    face=HEADS;
	else
	    face=TAILS;
 }


 public boolean isHeads()
 {

	if (face==HEADS)
	    return true;
    	else
	    return false;

	return (face==HEADS);
 }

} //end class
