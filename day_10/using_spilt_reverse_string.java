package Strings.day_10;

public class using_spilt_reverse_string {
    public static void main(String[] args){
        String s="java is easy";
        String[] str=s.split(" ");
        for(int i=0;i<str.length;i++)
        System.out.println(rev(str[i]));

    }
    public static String rev(String s){
        String rev ="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            rev+=ch;
        }
        return rev;
    }
}
