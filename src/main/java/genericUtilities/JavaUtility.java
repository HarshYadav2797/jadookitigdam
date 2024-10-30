package genericUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/**
	 * This method will return random number
	 * @return
	 */
	public int randomNumber()
	{
		Random num = new Random();
		int randomNUmber = num.nextInt(100);
		return randomNUmber;
	}
	
	/**
	 * This method will return current date
	 */
	
	public String currentDate()
	{
		Date date = new Date();
	    SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy-hh-mm-ss");
	    String currentDate = format.format(date);
	    return currentDate;
	}

}
