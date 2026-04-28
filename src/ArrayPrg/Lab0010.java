package ArrayPrg;

import java.util.Arrays;

public class Lab0010 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(arr.length);
        //System.out.println(Arrays.stream(arr).max());
        System.out.println(Arrays.stream(arr).count());
    }


}
