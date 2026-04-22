public class typeCastPrg {
    public static void main(String[] args) {
        byte b = 10; //implicit example of Widing
        int a = (int)b;
        int c = 20;
        byte d = (byte)c;
        //int a = b; also possible explicit
        System.out.println(a);
        //System.out.println();// compiler automatically done this type cast called implicit
        System.out.println(d);
    }
}
