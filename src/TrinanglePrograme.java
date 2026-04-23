import java.util.Scanner;

public class TrinanglePrograme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Line One");
        double line1 = sc.nextDouble();
        System.out.println("Please Enter Line Two");
        double line2 = sc.nextDouble();
        System.out.println("Please Enter Line Three");
        double line3 = sc.nextDouble();
        if (line1 <=0 || line1 <=0 | line1 <=0) {
            System.out.println("Number must be in interger and greater then zero");
        } else

        if (line1 == line2 && line2 == line3 && line1 == line3) {
            System.out.println("Its Equilateral triangles");
        } else if (line1 == line2 || line2 == line3 && line1 == line3) {
            System.out.println("This is Scalene triangles");
        } else {
            System.out.println("This is Isosceles triangles");
        }

    }
}
