/**
 * Created by lrterry on 10/13/16.
 */
import java.util.ArrayList;
public class Question8 {
    public static void main(String[]args){
    // Copy the array list from the previous question to this one.
    // Iterate over the ArrayList and print out each element.
    ArrayList<String> arry = new ArrayList<>();
    arry.add("foo");
    arry.add("eoo");
    arry.add("too");
    arry.add("uoo");
    arry.add("boo");
        for (int i = 0; i<arry.size(); i ++ ){
            System.out.println(arry.get(i));
        }
    }
}
