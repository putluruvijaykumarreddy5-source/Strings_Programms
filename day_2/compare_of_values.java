package Strings.day_2;

public class compare_of_values {
    public static void main(String[] args) {
        String s="madam";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            rev+=ch;
        }
            if(s.equals(rev)){
                System.out.println("Palindrome");
            }
                else 
                    System.out.println("Not palindrome");

            
        
    }
}
