package Strings.day_11;

public class last_repeated_char_given_string {
    public static void main(String[] args) {
        String s="programming";
        char last=' ';
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.indexOf(ch)==i&&s.indexOf(ch)!=s.lastIndexOf(ch)){
               last=ch;   
            }
        }
        System.out.println(last);
    }

}
