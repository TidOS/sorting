/******************************************
//  This is a driver for the RandomNumbers
//  Class.  It accepts a number of how
//  many numbers to get and then it gets them
//  and prints them directly to the console.
//
//  Jordan Thomas
//  February 2007
********************************************/
import java.util.Random;

public class getRandoms
{
	public static void main(String[] args)
	{
		//change this for different ranges of numbers
		final int  MAX = 5000000;
		Integer temp = Integer.parseInt(args[0]);
		int howMany = temp.intValue();
		Random rand = new Random();
		for(int i = 0; i < howMany; i++)
		{
			System.out.println(RandomNumbers.randomInt(rand,0,MAX));
		}
	}
}