package Function;

public class Lab006_noReturnNoArguments {
    public static void main(String[] args) {
        System.out.println("Hello");
        wake();
        run();


    }
   static void run(){ // No Arguments no return type
        System.out.println("I can run");
    }
    static void wake(){ //need to add the static keyword at the function name
         System.out.println("I can wake");
     }
}
