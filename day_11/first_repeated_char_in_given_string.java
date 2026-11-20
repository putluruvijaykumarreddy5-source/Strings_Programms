package Strings.day_11;

public class first_repeated_char_in_given_string {
    public static void main(String[] args) {
        String s="programming";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.indexOf(ch)!=s.lastIndexOf(ch)){
                System.out.println(ch);
                break;
            }
        }
    }
}
