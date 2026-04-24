public class Lab005_ForLoop {
    public static void main(String[] args) {
        for (int i = 0 ; i <=50 ; i ++){
            if (i%2== 0){
                System.out.println("The Even Number is :- " +i);
                continue;
            }
          // System.out.println(i);
        }
    }
}
