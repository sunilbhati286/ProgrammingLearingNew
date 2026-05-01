package ConstuctorPrg;

public class Lab0019 {
    public static void main(String[] args) {
        Baby b1 = new Baby(); // Automatically called the method due to constructor
    }
}
class Baby{
    Baby(){
        System.out.println("Hello Baby");
    }
}
