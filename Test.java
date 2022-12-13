package controller.internship;

import java.util.Arrays;

public class Test {
   private static void check(int[] arr, int toCheckValue)
    {
        // sort given array
        Arrays.sort(arr);

        // check if the specified element
        // is present in the array or not
        // using Binary Search method
        int res = Arrays.binarySearch(arr, toCheckValue);

        boolean test = res > 0 ? true : false;

        // Print the result
        System.out.println("Is " + toCheckValue
                + " present in the array: " + test);
    }

    public static void main(String[] args)
    {

        // Get the array
        int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };

        // Get the value to be checked
        int toCheckValue = 9;

        // Print the array
        System.out.println("Array: "
                + Arrays.toString(arr));

        // Check if this value is
        // present in the array or not
        check(arr, toCheckValue);
    }

}
