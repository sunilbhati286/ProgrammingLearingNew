public class arth_Operator1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        b+=20;
        String c = "Sunil";
        String d = "Bhati";
        int e = -10;
        boolean f = a < b;
        char x= 'A';
        char y = 'B';
        System.out.println(f);
        System.out.println(e);
        System.out.println(a+b+c+d);
        System.out.println(c+d+a+b);
        System.out.println(c+d+(a+b));
        System.out.println(10<=10);
        System.out.println(!(10==10));
        System.out.println(!(a>10) || (a<=10 ));
        System.out.println("The value of b is now " +b);
        System.out.println(x+y); // Coz its a characters so that it will add the ascii values
        System.out.println(e+y);
    }
}
