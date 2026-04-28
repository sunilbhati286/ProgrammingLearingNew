package Strings_Programe;

public class Lab009_StringFunctions {
    public static void main(String[] args) {
        String s1 = "Sunil";
        String s2 = "SunilBhati@yopmail.com";
        System.out.println(s1.length());
        System.out.println(s1.charAt(4));//Check the index value of that project
        System.out.println(s1.contains("Su"));
        System.out.println(s1.indexOf('u'));
        //System.out.println(s2.split(" "));
        String[] split = s2.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(s2.substring(5,12));
        StringBuilder strB = new StringBuilder("Sunil Kumar Bhati");
        System.out.println(strB.length());
        System.out.println(strB.append(" Pali"));
    }
}
