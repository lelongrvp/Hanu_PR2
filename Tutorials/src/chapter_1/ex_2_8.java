package chapter_1;
import static utils.TextIO.*;
/**
 * This class implements a simple program that
 * will initialise an array, performs some
 * operations on it and prints the results on the
 * standard output
 */
public class ex_2_8 {
    public static void main(String[] args) {
        // Declare the variables
        int nums[] = {2, 0, 1, 3};
        // Do some operations on array
        int sum = 0, i;
        int n;
        // calculates two sums: the sum of the elements at the even indices and the sum of the elements at the odd
        //indices.
        for (i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            } else if (i % 2 != 0) {
                sum += nums[i];
            }
        }
        // Print both sums
        System.out.println("The sum of the elements at the even indices is " + sum);
        System.out.println("The sum of the elements at the odd indices is " + sum);
//        for(i = 0; i < 4; i++) {
//            n = nums[i];
//            System.out.printf("nums[%d] = %d\n", i, n);
//            sum = sum + n;
//        }
//        System.out.print("Sum: ");
//        System.out.println(sum);
    }
}
