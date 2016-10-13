/**
 * Created by lrterry on 10/13/16.
 */
import java.util.ArrayList;
public class Question1 {
    static ArrayList<Integer> nums = new ArrayList<>();

    public static void main(String[] args) {
        // Create an array list with numbers 1 - 10
        // Print out size of array list
        addNum();
    }

    public static void addNum() {

        for (int i = 0; i < 10; i++) {
            nums.add(i);
        }
        System.out.println(nums.size());
    }
}


