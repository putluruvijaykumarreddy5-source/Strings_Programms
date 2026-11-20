package Strings.day_6;

public class smallest_substring_palindrome {
    public static void main(String[] args) {
        String s="malayalam";
        String smallpalindrome=s;
        for(int i=0;i<s.length();i++){
            for(int j=i+3;j<=s.length();j++){
                String str=s.substring(i,j);
                if(ispalindrome(str)){
                    if(str.length() <smallpalindrome.length())
                        smallpalindrome=str;

                }
            }
        } 
        System.out.println(smallpalindrome);
    }
    public static boolean ispalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;

        }
        return true;
    }
}
