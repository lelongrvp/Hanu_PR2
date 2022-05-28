package chapter_4;

import java.util.Arrays;

public class Array {
    public static int countNegatives(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        return count;
    }

    public static int countEvens(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static float[] divArray(float[] arr) {
        float[] result = new float[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] / 2;
        }
        return result;
    }

    public static boolean isAscSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int length(char[] arr) {
        // find the length of a char array using NUL as a terminator
        int length = 0;
        while (arr[length] != 0) {
            length++;
        }
        return length;
    }

    public static float median(float[] a) {
        // sort the array and return the median
        float[] b = a.clone();
        Arrays.sort(b);
        int length = b.length;
        if (length % 2 == 0) {
            return (b[length / 2] + b[length / 2 - 1]) / 2;
        } else {
            return b[length / 2];
        }
    }

    public static int compare(float[] arr1, float[] arr2) {
        // compare two float arrays and determine one of those results
        // arr1 equals arr2
        // arr1 is subset of arr2
        // arr2 is subset of arr1
        // arr1 and arr2 are disjoint
        int result = 0;
        int length = arr1.length;
        if (arr1.length != arr2.length) {
            result = 1;
        } else {
            for (int i = 0; i < length; i++) {
                if (arr1[i] != arr2[i]) {
                    result = 1;
                }
            }
        }
        return result;
    }

    public static int[] freq(float[] arr) {
        // find the frequency of each element in a float array
        int[] freq = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            freq[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                }
            }
        }
        return freq;
    }

    public static void main(String[] args) {
        // test the median method
        System.out.println("Testing median method:");
        float[] arr = {1};
        System.out.println(median(arr));
        float[] arr1 = {1, 2};
        System.out.println(median(arr1));
        float[] arr2 = {-1, 0, 2};
        System.out.println(median(arr2));
        float[] arr3 = {-1, 0, 1, 2};
        System.out.println(median(arr3));
        float[] arr4 = {1, 2, 3, 3, 2, 4, 4};
        System.out.println(median(arr4));
        float[] arr5 = {5, 4, 3, 3, 2, 1};
        System.out.println(median(arr5));
        float[] arr6 = {3, 4, 5, 1, 2, 3};
        System.out.println(median(arr6));
        float[] arr7 = {3, 4, 2, 1, 5, 3};
        System.out.println(median(arr7));
        // test freq method
        System.out.println("Testing freq method:");
        float[] arr8 = {1, 2, 3, 3, 2, 4, 4};
        System.out.println(Arrays.toString(freq(arr8)));
    }
}
