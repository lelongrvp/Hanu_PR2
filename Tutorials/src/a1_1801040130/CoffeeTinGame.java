package a1_1801040130;

import java.util.*;
import utils.TextIO;

/**
 * @overview A program that performs the coffee tin game.
 */
public class CoffeeTinGame {
    /** constant value for the green bean*/
    private static final char GREEN = 'G';
    /** constant value for the blue bean*/
    private static final char BLUE = 'B';
    /** constant for removed beans */
    private static final char REMOVED = '-';

    /**
     * the main procedure
     * @effects
     *    initialize a coffee tin
     *    {@link TextIO#putf(String, Object...)}: print the tin content
     *    {@link @tinGame(char[])}: perform the coffee tin game on tin
     *    {@link TextIO#putf(String, Object...)}: print the tin content again
     *    if last bean is correct
     *      {@link TextIO#putf(String, Object...)}: print its color
     *    else
     *      {@link TextIO#putf(String, Object...)}: print an error message
     */
    public static void main(String[] args) {
        // initialize some beans
        char[] beans= {BLUE,BLUE,GREEN,GREEN,GREEN,GREEN,BLUE,GREEN};
        //count the number of greens
        int greens =0;

        for(char b:beans)
        {
            if (b==GREEN)
                greens++;
        }
        // the expected last bean
        final char last=(greens%2==1)?GREEN:BLUE;
        // print the content of tin before the game
        // p0= green parity/\
        // (p0=1 -> last = GREEN) /\ (p0=0 ->last= BLUE)
        System.out.printf("tin before :%s %n",Arrays.toString(beans));
        //perform the game
        char lastBean=tinGame(beans);
        //lastBean = last\/ lastBean!last
        //print tin after the game
        System.out.printf("tin after :%s %n",Arrays.toString(beans));
        // check if last bean as expected and print
        if (lastBean==last)
        {
            System.out.println("last bean: "+lastBean);
        }
        else {
            System.out.printf("Oops, wong last bean: %c (expected : %c).%n",lastBean,last);
        }
    }

    /**
     * Performs the coffee tin game to determine the color of the last bean
     *
     * @requires tin is not null /\ tin.length > 0
     * @modifies tin
     * @effects <pre>
     *          repeatedly remove two beans from tin and update tin as follows
     *          if are same colour
     *             throw both away, put one blue bean back
     *          else
     *             put green bean back
     *          if the number of green beans is even
     *            return blue
     *          else
     *            return green
     *
     *      i.e.  (p0 = 0 /\ one blue left) \/
     *            (p0 = 1 /\ one green left), where p0 = initial green parity
     *            </pre>
     */
    public static char tinGame(char[] tin) {
        int count = tin.length;

        while (count > 1) {
            updateTin(tin, takeOne(tin));
        }

        char LastBean = 0;

        //Loop invariant
        for (char x : tin) {
            // Check whether bean is available or not
            if (x != REMOVED) {
                LastBean = x;
            }
        }
        return LastBean;
    }

    /**
     * Randomly take out a bean
     * @effects
     *      using ranInt to take out a bean
     *      if
     *          bean is available
     *          take out the bean
     *      else
     *          return indices
     */
    public static int[] takeOne(char[] tin) {
        int[] randIndices = new int[1];
        int bean;
        bean = randInt(tin.length);
        // Check whether the random bean are available or not
        while (tin[bean] == REMOVED) {
            // Take 1 random beans from tin
            bean = randInt(tin.length);
        }
        // Return indices
        randIndices[0] = bean;

        return randIndices;
    }

    /**
     *  Update the tin
     * @effects
     */
    public static void updateTin(char[] tin, int[] randIndices) {
        char bi1, bi2;

        // Determine 2 random beans
        bi1 = tin[randIndices[0]];
        bi2 = tin[randIndices[1]];

        tin[randIndices[0]] = REMOVED;
        tin[randIndices[1]] = REMOVED;

        // Color check and update
        if (bi1 == bi2) {
            tin[randIndices[0]] = BLUE;
        } else {
            if (bi1 == BLUE) {
                tin[randIndices[1]] = GREEN;
            } else {
                tin[randIndices[0]] = GREEN;
            }
        }
    }

    /**
     * Return a random integer from the selected range
     * @effects
     *      return r.ints(0, n).limit(1).findFirst().getAsInt()
     */
    public static int randInt(int n) {
        // Return a random integer number from 0 (inclusive) to n (exclusive)
        Random r = new Random();
        return r.ints(0, n).limit(1).findFirst().getAsInt();
    }
}
