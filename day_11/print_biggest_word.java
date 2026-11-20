package Strings.day_11;

public class print_biggest_word {
    public static void main(String[] args) {
        String s="java is programming";
        String[] str=s.split(" ");
        String big="";
        for(int i=0;i<str.length;i++){
            if(str[i].length()>big.length())
                big=str[i];
        }
        System.out.println(big);
    }
}
