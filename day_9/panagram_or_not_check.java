package Strings.day_9;

public class panagram_or_not_check {
    public static void main(String[] args){
        String s="A quick brown fox jumps over the lazy dog";
         System.out.println(ispanagram(s));
       
    }
    public static boolean ispanagram(String s){
        s=s.toLowerCase();
        for(char ch='a';ch<='z';ch++){
            if(!s.contains(ch+""))return false;
        }
        return true;
    }
}
