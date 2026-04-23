import java.sql.SQLOutput;
import java.util.Scanner;

public class primeoddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter any valid integer number: ");
        int number = sc.nextInt();
        if (number%2 == 0){
            System.out.println("Number is Prime Number");
        }
        else {
            System.out.println("Number is Odd Number");
        }
        sc.close(); // To close the Scanner
    }
}
