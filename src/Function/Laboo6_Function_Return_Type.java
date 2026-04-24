package Function;

public class Laboo6_Function_Return_Type {
    public static void main(String[] args) {
//        String eng = engineer();
//        System.out.println(eng);
//        //Age is returning so that we need to add that integer and it will display the returned value
//        int age_new = age();
//        System.out.println(age_new);
//        name("Sunil");
//        name("Ajay");
       // details("Sunil Bhati" , 45, 50000);
        int total = sum(10,20);
        int ltotal = sum(1000, 2000);
        System.out.println("The total of A and B are: - " +total);
        System.out.println("The Long Total of A and B are: - " +ltotal);
    }

    //No Arguments but with Return type
    static String engineer() {
        return "We all are Engineer";
    }

    static int age() {
        return 25;
    }

    //No Return type but with Parameters
    static void name(String fname)
    {
        System.out.println("Name of the User is :- " + fname);
    }
    static void details (String fname, int agenew , double salary)
    {
        System.out.println("Name of the Person is : - " +fname+ "\nAge of the Person is : - " +agenew+ "\nSalary of the Person is : - "+salary);
            }
            //With Parameter and with Return Type

    static int sum(int a , int b){
        return a+b;
    }
}
