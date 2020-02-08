// gives the date to the nearest thousandth of a second

//based off a file found at
//http://www.rgagnon.com/javadetails/java-0106.html
//...though the Java API would have been just as helpful
//
//Jordan Thomas
//February 2007

import java.util.*;
import java.text.*;

public class Time
{
	public static void main(String[] args)
	{
	}

	public static String getDate ()
	{
	Date today = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss:SSS");
	String datenewformat = formatter.format(today);
	return  datenewformat;
	}
}