package Java_Basic_Programs;
import java.util.Scanner;
public class Prob02_Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner Year = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = Year.nextInt();
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
            System.out.println( year+ " year is leap year");
        } else {
            System.out.println(year + " year is not a leap year");
        }

	}

}
