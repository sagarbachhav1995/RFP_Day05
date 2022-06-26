package Java_Basic_Programs;
import java.util.Scanner;
public class Prob04_HarmonicNo {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
  Scanner num = new Scanner(System.in);
  System.out.println("Enter the Number");
        int number = num.nextInt();
        double nthHarmonic = 0.0;
        if (number != 0) {
            for (int i = 1; i <= number; ++i) {
  System.out.println("1/" + i ) ;
nthHarmonic += 1.0 / i;
}
}
else {
System.out.println("Invalid Input Enter the Non-Zero Input");
}
System.out.println("=" + nthHarmonic);
    
	}

}