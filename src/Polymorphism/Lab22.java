package Polymorphism;

public class Lab22 {
    public static void main(String[] args) {
        MathOperations maths = new MathOperations();
        int total = maths.add(4,5);
        System.out.println("Total of two Arugment:- " +total);
        int totalnew = maths.add(4,5,6);
        System.out.println("Total of three Arguments:- " +totalnew);
    }
}
