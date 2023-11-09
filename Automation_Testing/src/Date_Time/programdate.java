package Date_Time;

import java.util.Date;

public class programdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Import the date from java.util
		Date date = new Date();
//This date is not accepted in the screen shot file name 
		System.out.println(date);

//so we need to replace the space and : with some other character
		String newdate=date.toString().replace(' ', '-').replace(':', '-');
		System.out.println(newdate);

	}

}
