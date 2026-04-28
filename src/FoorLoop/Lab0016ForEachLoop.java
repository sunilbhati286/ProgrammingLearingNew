package FoorLoop;

public class Lab0016ForEachLoop {
    public static void main(String[] args) {
        int[] marks = {10,15,16,25,36,78};
        int sum = 0;
        for (int n : marks) // only increment should be added not decrement
        {
            sum = sum = n;
        }
        System.out.println(sum);
    }
}
