package Strings.day_8_occurence_programs;

public class occurence_each_character_given_string {
    public static void main(String[] args){
        String s1="jaavedev";
        while(s1.length()>0){
            char ch=s1.charAt(0);
            String s2=s1.replace(ch+"" ,"");
            int count=s1.length()-s2.length();
            System.out.println(ch+"="+count);
            s1=s2;
        }
    }
}
