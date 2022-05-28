package chapter_1;
import static utils.TextIO.*;

public class ex_2_3 {
    public static void main(String[] args) {
        // ask for user name
        put("Enter your name: ");
        String name = getln();
        // change name to uppercase
        name = name.toUpperCase();
        putln("Hello, " + name + ", nice to meet you!");
    }
}
