package Strings.day_10;

public class palindrome_words_print {
    public static void main(String[] args) {
        String s="madam sir madam";
        String []str=s.split(" ");
        for(int i=0;i<str.length;i++){
            if(ispalindrome(str[i])){
                System.out.println(str[i]);
            }
        }
    }
    public static boolean ispalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(j>i){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}
