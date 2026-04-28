package FoorLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab0017SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {78,87,58,91,45,12,10};
        Arrays.sort(numbers);
        System.out.println("Sorted Arrays" +Arrays.toString(numbers));
        System.out.println(numbers [numbers.length-2]);
    }
}
