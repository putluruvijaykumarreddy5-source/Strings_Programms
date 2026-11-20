package Strings.day_1;

public class vowel_characters_print_in_given_string {
   public static void main(String[] args) {
       String s="vijay KUMAR reddy";
       String vowel="";
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            System.out.println(ch);
       }
   } 
}
