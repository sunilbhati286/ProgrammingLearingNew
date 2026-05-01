package HirInheritance;

public class LabClass {
    public static void main(String[] args) {
        Sunil sb= new Sunil();
        Manoj mb = new Manoj(); // Create object of all the child classes coz they are inherited from Parent
        Sharad ssb = new Sharad();
        sb.home();
        ssb.home();
        mb.home();
        sb.sb();
    }


}
