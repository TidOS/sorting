//Jordan Thomas
//February 2007

import java.io.*;

public class WriteFile
{

	/***********************************************
	//  A simple method to write an array to a file.
	//  It accepts an array, the number of items
	//  to print, and a file name.
	//
	//  It proceeds to print the integer value of
	//  each of these to the file and then exits
	/***********************************************/
	public static void write(int[] x, int num, String filename)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream(filename);
			PrintStream ps = new PrintStream(fos);
			for (int i = 0; i <= num - 1; i++)
			{
				ps.println(x[i]);
			}

			ps.close();
		}
		catch (IOException IOE)
		{
		}
	}

}