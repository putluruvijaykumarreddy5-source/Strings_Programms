package Strings.day_2;

public class compare_values_equal_or_not {
    public static void main(String[] args) {
        String s="Vijay";
        String s1=new String("Vijay");
        System.out.println(s+"\t"+s1);//Vijay   Vijay
        System.out.println(s==s1);    //false
        System.out.println(s.equals(s1));//true

    }
}
