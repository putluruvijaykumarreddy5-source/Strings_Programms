package Strings.day_1;

public class reverse_string_print {
    public static void main(String[] args){
        String s="Vijay kumar reddy";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            rev+=ch;
        }
        System.out.println(rev);
    }
}
