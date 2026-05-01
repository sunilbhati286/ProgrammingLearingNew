package Inheritance;

public class Child extends Father {
    public static void main(String[] args) {
        sing();
        sleep();
        Child  ch = new Child();
        ch.dance();
        System.out.println("I have my father gold:- " +ch.gold);
    }
    void dance(){
        System.out.println("I can dance also");
    }
}
