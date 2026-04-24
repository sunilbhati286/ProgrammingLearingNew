package Strings_Programe;

public class Lab008_String {
    public static void main(String[] args) {
        String s1 = "Sunil";
        String s2 = "Sunil";
        String s3 = new String("Bhati");
        String s4 = new String("Bhati");
       // s1.concat("Bhati");
        //System.out.println(s1);
       // s1 = s1.concat(" Bhati"); // It will showing only the Sunil, we need to re assign the values then it will sow the main string
        //System.out.println(s1);
        System.out.println(s1==s2);// It will dispalyed the location only
        System.out.println(s3==s4);
    }
}
