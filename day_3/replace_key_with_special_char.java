package Strings.day_3;

public class replace_key_with_special_char {
    public static void main(String[] args){
        String s="javadev";
        char key='v';
        char speacial='@';
        char [] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]==key)
                ch[i]='@';
        }
        System.out.println(ch);
    }
    
}
