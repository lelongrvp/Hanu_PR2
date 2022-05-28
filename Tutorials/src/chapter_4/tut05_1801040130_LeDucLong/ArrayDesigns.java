package chapter_4;

public class ArrayDesigns {
    /**
     * Count the number of negative elements of an array of integers.
     *
     * @requires a != null
     * @effects
     *    return the number of negative elements in a
     */
    public static int countNegatives(int[] a) {
        return 0;
    }

    /**
     * Count the number of even elements of an array of positive integers.
     *
     * @requires x > 0 for all x in a
     * @effects
     *    if a is null
     *       return 0
     *    else
     *       return [x | x in a /\ x % 2 == 0].size
     */
    public static int countEvens(int[] a) {
        return 0;
    }

    /**
     * Divide the elements of a real number array by a real number
     * and return a real number array as the result.
     *
     * @requires d != 0
     * @effects
     *    if a is null
     *       return null
     *    else if a = []
     *       return []
     *    else
     *       return [x / d | x in a]
     */
    public static float[] divArray(float[] a, float d) {
        return null;
    }

    /**
     * Determine whether an integer array is in ascending order
     * @effects if a[i] <= a[i+1] for all a[i], i < max_index(a)
     * return true
     * else
     * return false
     */
    public static boolean isAscSorted(int[] a) {
        return false;
    }

    /**
     * Find the length of a char array using NUL as a terminator.
     * @requires str != null
     * @effects
     *    return the number of elements of str before the NUL character
     */
    public static int length(char[] str) {
        return 0;
    }

    /**
     * @requires a != null /\ a.length > 0
     * @effects
     * L(x) = the number of elements y in a where y < x
     * R(x) = the number of elements y in a where y > x
     * C(x) = |L(x) - R(x)|     *
     * return the smallest x in a that satisfies:
     *        for all a_i in a, C(x) <= C(a_i)
     */
    public static float median(float[] a) {
        return 0;
    }

    /**
     * Compare two arrays A and B and determine one of these results:
     *    A equals B
     *    A is subset of B
     *    B is subset of A
     *    A intersects B
     *    A disjoints B
     * @requires a != null /\ b != null
     * @modifies a, b
     * @effects
     *    if a = b
     *       return 0
     *    else if a is subset of b
     *       return 1
     *    else if b is subset of a
     *       return 2
     *    else if a intersect b
     *       return 3
     *    else (i.e. a disjoint b)
     *       return 4
     */
    public static int compare(float[] a, float[] b) {
        return 0;
    }

    /**
     * Compute the frequencies of all elements of an array of reals.
     * e.g. {5.5, 6, 2, 6} -> {1, 2, 1, 2}
     *
     * @effects
     *    if a is null
     *       return null
     *    else if a.length == 0
     *       return []
     *    else
     *       let Fr(x) be the frequency of x in a
     *       i.e. Fr(x) = [y | y in a /\ y == x].length
     *       return [Fr(a[i]) | 0 <= i < a.length]
     */
    public static int[] freq(float[] a) {
        return null;
    }

    /**
     * the main procedure
     */
    public static void main(String[] args) {

    }

}
