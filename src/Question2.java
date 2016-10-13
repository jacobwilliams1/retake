/**
 * Created by lrterry on 10/13/16.
 */
import java.util.Scanner;
public class Question2 {
    public static void main(String[]args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        //Ask a user to add in a number, save it to a variable and print out that variable.
        System.out.println("Enter a num");
        num = scanner.nextInt();
        System.out.print(num);
    }
}
