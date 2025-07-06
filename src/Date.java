import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;

public class Date {

	public static void main(String[] args) throws ParseException {

		Date d = new Date();

		System.out.println(d.toString());

		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:MM:SS");

		//System.out.println(sdf.format(d));

		Calendar cal = Calendar.getInstance();

		System.out.println(sdf.format(cal.getTime()) + "/////");
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));

		System.out.println(cal.get(Calendar.MILLISECOND));

		int a[][] = { { 18, 2, 3 }, { 4, 5, 6 }, { 7, 1, 9, 10 } };

		int num = 1;

		int row = 0;

		int col = 0;

		for (row = 0; row < a.length; row++) {

			for (col = 0; col < a[row].length; col++) {

				if (a[row][col] < 2) {

					System.out.println("Smallest num is " + a[row][col]);

				}

			}

		}
		
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date date = sdf1.parse("31/03/2017");
		System.out.println(date);
		

	}

}
