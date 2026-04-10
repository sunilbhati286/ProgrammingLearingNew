public class StarPattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {        // controls number of rows
            for (int j = 1; j <= i; j++) {       // prints stars in each row
                System.out.print("*");
            }
            System.out.println();                // move to next line
        }
    }
}
