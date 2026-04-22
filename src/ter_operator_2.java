public class ter_operator_2 {
    public static void main(String[] args) {
        int a =40;
        int b = 20;
        int c = 20;

        int result = (a>=b)? ((a>=c) ? a:c) : ((b>=c)? b:c);
        System.out.println("Largest number is :- " +result);
    }
}
