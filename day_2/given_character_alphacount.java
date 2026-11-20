package Strings.day_2;

public class given_character_alphacount {
    public static void main(String[] args) {
        String s="Vijay@2005";
        int alphacount=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
                alphacount++;


        }
        System.out.println(alphacount);
    }
}
