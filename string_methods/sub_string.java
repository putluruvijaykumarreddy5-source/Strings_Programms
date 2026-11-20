package Strings.string_methods;

public class sub_string {
    public static void main(String[] args){
        String s="malayalam";
        char [] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            for(int j=i+3;j<s.length();j++){
                  System.out.println(s.substring(i, j));
            }  
        } 
    }
}
