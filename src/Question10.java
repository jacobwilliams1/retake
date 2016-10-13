//import com.sun.java.util.jar.pack.Instruction;

import java.util.Scanner;

/**
 * Created by lrterry on 10/13/16.
 */
public class Question10 {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        isVowel(s);
//        System.out.print(s + " is" + (isVowel(s) ? " " : " not ") + "a vowel");
    }

    public static boolean isVowel(String s) {
        switch(s){
            case "a":
                System.out.print(s+" Is a vowel");
                break;
            case "e":
                System.out.print(s+" Is a vowel");
                break;
            case "i":
                System.out.print(s+"Is a vowel");
                break;
            case "o":
                System.out.print(s+" Is a vowel");
                break;
            case "u":
                System.out.print(s+" Is a vowel");
                break;
            default:
            System.out.print(s+" Is not a vowel");
            break;
        }
        // fill this in.
        // this should check if the string, 1 character, given is a vowel.

        return false;
    }
}


