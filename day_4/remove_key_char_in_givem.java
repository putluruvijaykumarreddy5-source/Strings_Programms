package Strings.day_4;

public class remove_key_char_in_givem {
    public static void main(String[] args) {
        String s="ramana";
        char key='a';
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=key)
            res+=ch;

        }
        System.out.println(res);
   
    }
    
}
