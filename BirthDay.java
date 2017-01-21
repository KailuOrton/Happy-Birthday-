import java.util.*;

/**
 * Created by Kailu on 12/11/16.
 */
public class BirthDay {

    public static void main(String[] args) {
        GregorianCalendar yourDateOfBirth;
        int year, month, day;
        Scanner scanner;
        String dayOfWeek;
        Locale locale = new Locale("EN");
        scanner = new Scanner(System.in);
        System.out.println("Enter the year of your birth");
        year = scanner.nextInt();


        System.out.println("Enter the month of your birth (0 for Jan, 1 for Feb, etc.)");
        month = scanner.nextInt();

        System.out.println("Enter the day of your birth");
        day = scanner.nextInt();

        yourDateOfBirth = new GregorianCalendar(year, month, day);
        dayOfWeek = yourDateOfBirth.getDisplayName(Calendar.DAY_OF_WEEK, yourDateOfBirth.LONG, locale);

        System.out.println("You were born on a " + dayOfWeek);
    }

}
