package Strings.day_3;

public class replace_with_vowel_char_count_3_then_underscore {
   public static void main(String[] args) {
       String s="ramana";
       int count=0;
       char[] ch=s.toCharArray();
       for(int i=0;i<s.length();i++){
        if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            count++;
       }
       if(count>=3)
        for(int i=0;i<s.length();i++){
        if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')  
            ch[i]='_';
    
        }
        System.out.println(ch);

   } 
}
