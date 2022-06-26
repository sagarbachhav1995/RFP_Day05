package Java_Basic_Programs;
import java.util.Scanner; 
public class Prob05_Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner factor = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = factor.nextInt();
        for (int i = 2; i * i <= a; ++i) {
            while (a % i == 0) {
                a /= i;
                System.out.print(String.valueOf(i) + " ");
            }
        }
        if (a != 1) {
            System.out.print(a);
        }
    
	}

}