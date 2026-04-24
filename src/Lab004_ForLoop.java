public class Lab004_ForLoop {
    public static void main(String[] args) {
        for(int i = 0 ; i <=50 ; i ++){
            if (i == 6){
                continue; // it will skip the 6 and continue for further
            }
            System.out.println(i);
        }
    }
}
