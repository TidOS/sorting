/*****************************************
//  This Class generates random numbers
//  based on a low value and a high value
//  It returns the number; be it a double or
//  an int (whichever is requested)
//
//  Jordan Thomas  **
//  Sometime last year I think (2006) **
//
//  ** I am not sure if I wrote this
//  or if it was given to me.  If I did
//  indeed write it, it was in 2006
*********************************************/

import java.util.Random;

public class RandomNumbers
{

  public static void main(String[] args)
  {

  }

   //random double between the given limits, low and high
  public static double randomDouble(Random rand, int low, int high)
  {
	//calculates the randomdouble to be used in random drivers.
	double num1 = rand.nextDouble()* (high-low) + low;
	return num1;
  }
  //  The above multiplies by the (high - low) and adds the low in order to for example get a number within
  //  the range of 3-7 if the lower was 3 and upper was 7.

  //random integer inclusive of the given limits, low and high
  public static int randomInt(Random rand, int low, int high)
  {
	if(high == low)
	return 0;
	if(high < low)
	{
		int temp = high;
		high = low;
		low = high;
	}
  //calculates the randomint to be used in random drivers
  int num2 = (rand.nextInt((high - low) + 1)) + low;
  return num2;
  }

}
