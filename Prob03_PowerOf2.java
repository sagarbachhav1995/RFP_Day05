package Java_Basic_Programs;
import java.util.Scanner;
public class Prob03_PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner num = new Scanner(System.in);
System.out.println("Enter The number");
for (int a = num.nextInt(); a <= 31; ++a) {
for (int i = 1; i <= a; ++i) {
System.out.println("Power Of 2 is " + i + "=" + 2 * i);
 }
 }
 }

}
