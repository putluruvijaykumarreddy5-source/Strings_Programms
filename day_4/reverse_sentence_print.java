package Strings.day_4;

public class reverse_sentence_print {
    public static void main(String[] args){
        String s="Vijay kumar reddy";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!=' '){
            rev=ch+rev;
        }
        else
        {
            System.out.print(rev+" ");
            rev="";
        }
    }
       System.out.println(rev);
    }
}
