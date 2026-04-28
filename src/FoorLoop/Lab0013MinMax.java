package FoorLoop;

public class Lab0013MinMax {
    public static void main(String[] args) {
        int[] marks = {10,20,30,40,50};
        int max = marks[0];
        int min = marks[0];
        for (int i = 0; i <marks.length; i ++)
        {
            if (marks[i] > max)
            {
                max = marks[i];
            }
            if (marks[i] < max)
            {
                min = marks[i];
            }

        }
        System.out.println("Largest Number is : " +max);
        System.out.println("Smallest Number is : " +min);

    }
}
