package Java_Basic_Programs;
import java.util.Random;

public class Prob10_Largest_Among_Three_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Random Number = new Random();
        int First_num = Number.nextInt(100)+1;
        System.out.println(+First_num);
        int Second_num = Number.nextInt(100)+1;
        System.out.println(+Second_num);
        int Third_num = Number.nextInt(100)+1;
        System.out.println(+Third_num);

        if (First_num > Second_num && First_num > Third_num) {
            System.out.print(String.valueOf(First_num) + " " + " Is Largest Number Between 3 Random Number");
                }
        else if (Second_num > First_num && Second_num > Third_num) {
            System.out.print(String.valueOf(Second_num) + " " + "Is Largest Number Between 3 Random Number");
                }
        else {
            System.out.print(String.valueOf(Third_num) + " " + "Is Largest Number Between 3 Random Number");
        }
    
	}

}
