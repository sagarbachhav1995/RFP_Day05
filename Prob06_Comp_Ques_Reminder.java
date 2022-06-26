package Java_Basic_Programs;
import java.util.Scanner; 
public class Prob06_Comp_Ques_Reminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner num = new Scanner(System.in);
        System.out.print("Insert the Numerator ");
        int numerator =num.nextInt();
        System.out.print("Insert the  Denominator");
        int denominator = num.nextInt();
        double remainder = numerator % denominator;
        System.out.println("Remainder is :" + remainder);
        double quotient = numerator / denominator;
        System.out.println(" Quotient is :" + quotient);
    
	}

}