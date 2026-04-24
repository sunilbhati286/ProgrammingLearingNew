import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab001_Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any valid Number:-");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("This is Sunday");
                break;
            case 2:
                System.out.println("This is Monday");
                break;
            case 3:
                System.out.println("This is Tuesday");
                break;
            case 4:
                System.out.println("This is Wednesday");
                break;
            case 5:
                System.out.println("This is Thursday");
                break;
            case 6:
                System.out.println("This is Friday");
                break;
            case 7:
                System.out.println("This is Saturday");
            default:
                System.out.println("You Entered wrong number");
        }

    }
}
