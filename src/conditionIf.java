import java.util.Scanner;

public class conditionIf {
    public static void main(String[] args) {
        //int age = Integer.parseInt(args[0]); // Accept input from CLI method
        Scanner sc = new Scanner(System.in); // User can enter the content from Console
        System.out.println("Please enter the age: -  ");
        int age = sc.nextInt();
        if (age>18)
        {
            System.out.println("You are eligible for Vote !!!");
        }
        else
        {
            System.out.println("You are not eligible for Vote !!!");
        }
    }
}
