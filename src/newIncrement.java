public class newIncrement {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        int c = a++;
        System.out.println("The value of a is : - " +a); //++ will asign the value first then print so its 11
        System.out.println("The Value of b is : - " +b); // value of b is equal to a so that its 11
        System.out.println("The value of C is :- " +c);
        System.out.println(a); // value of a is now 12 coz its added 12
    }

}
