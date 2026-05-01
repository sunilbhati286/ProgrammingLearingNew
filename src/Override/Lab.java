package Override;

public class Lab {
    public static void main(String[] args) {
        Father ftr = new Father();
        ftr.home();
        son sn = new son();
        sn.home();
        Father ftt = new son();
        ftt.home();
    }
}
