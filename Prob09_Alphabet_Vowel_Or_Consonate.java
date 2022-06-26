package Java_Basic_Programs;
import java.util.Scanner;
public class Prob09_Alphabet_Vowel_Or_Consonate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner vc = new Scanner(System.in);
        System.out.println("Enter a Alphabet");
        char ch = vc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println((ch) + " is a Vowels");
        }
        else {
        System.out.println((ch) + " is a Consonents");
    }
	}

}