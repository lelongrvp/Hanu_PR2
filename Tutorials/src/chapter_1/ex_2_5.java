package chapter_1;
import static utils.TextIO.*;
public class ex_2_5 {
    public static void main(String[] args) {
        // ask user how many eggs she has left
        System.out.println("How many eggs do you have?");
        int eggs = getlnInt();
        // convert the eggs to gross, dozen
        int gross = eggs / 144;
        int dozen = eggs / 12;
        int remain = eggs % 12;
        // print the result
        System.out.println("You have " + gross + " gross eggs and " + dozen + " dozen eggs and " + remain + " eggs left.");
    }
}
