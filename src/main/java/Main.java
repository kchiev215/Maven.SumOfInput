import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number value: ");
        int num = scan.nextInt();
        int sum = 0;
        for (int i = 0; i<num; i++){
            sum  += i;
        }
        System.out.println("Sum of numbers : " + sum);
    }
}
