import java.util.Calendar;
import java.util.GregorianCalendar;

public class RandomDate {
	public static void main(String[] args) {

		/*
		 * GregorianCalendar gc = new GregorianCalendar();
		 * 
		 * int year = randBetween(2010, 2020);
		 * 
		 * gc.set(Calendar.YEAR, year);
		 * 
		 * int dayOfYear = randBetween(1, gc.getActualMaximum(Calendar.DAY_OF_YEAR));
		 * 
		 * gc.set(Calendar.DAY_OF_YEAR, dayOfYear);
		 */

        //System.out.println(gc.get(Calendar.DAY_OF_MONTH) + "-" + (gc.get(Calendar.MONTH) + 1) + "-" + gc.get(Calendar.YEAR));
        System.out.println(generateDate());
    }

	/*
	 * public static int randBetween(int start, int end) { return start +
	 * (int)Math.round(Math.random() * (end - start)); }
	 */
    public static String generateDate()
    {
    	 GregorianCalendar gc = new GregorianCalendar();
    	 
         int year = 2010 + (int)Math.round(Math.random() * (2020 - 2010));

         gc.set(Calendar.YEAR, year);

         //int dayOfYear = randBetween(1, gc.getActualMaximum(Calendar.DAY_OF_YEAR));
         int dayOfYear = 1 + (int)Math.round(Math.random() * (gc.getActualMaximum(Calendar.DAY_OF_YEAR) - 1));

         gc.set(Calendar.DAY_OF_YEAR, dayOfYear);
 
         String date = gc.get(Calendar.DAY_OF_MONTH) + "-" + (gc.get(Calendar.MONTH) + 1) + "-" + gc.get(Calendar.YEAR);
         
         return date;
    }
}
