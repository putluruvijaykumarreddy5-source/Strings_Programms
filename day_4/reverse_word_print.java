package Strings.day_4;

public class reverse_word_print {
    public static void main(String[] args) {
        String s="java         is           easy       ";
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                res=ch+res;
            }
            else if(!res.equals("")){
                System.out.print(res+" ");
                res="";
            }
        }
        //if(!res.equals("")){
        System.out.println(res);
        //}
    }
    
}
