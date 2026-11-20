package Strings.day_8_occurence_programs;

public class min_occurence {
    public static void main(String[] args){
        String s1="aaabbc";
        char minchar=' ';
        int mincount=s1.length();
        while(s1.length()>0){
            char ch=s1.charAt(0);
            String s2=s1.replace(ch+"", "");
            int count=s1.length()-s2.length();
            if(count<mincount){
                 mincount=count;
                minchar=ch;
                 s1=s2;
               

            }
             //s1=s2;

             
           
        }
        System.out.println(minchar+"="+mincount);
    }
}
