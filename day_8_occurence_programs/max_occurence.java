package Strings.day_8_occurence_programs;

public class max_occurence {
    public static void main(String[] args){
        String s1="aaabbc";
        char maxchar=' ';
        int maxcount=0;
        while(s1.length()!=0){
            char ch=s1.charAt(0);
            String s2=s1.replace(ch+"", "");
            int count=s1.length()-s2.length();
            if(count>maxcount){
                maxcount=count;
                maxchar=ch;
            }
            System.out.println(ch+"="+count);
            s1=s2;
        }
        System.out.println("======");
        System.out.println(maxchar+"="+maxcount);
    }
    
}
