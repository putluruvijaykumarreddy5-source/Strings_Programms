package Strings.day_8_occurence_programs;

public class second_min_occurence {
    public static void main(String[] args){
        String s1="aaabbbccd";
        char minchar1=' ';
        char minchar2=' ';
        int mincount1=s1.length();
        int mincount2=s1.length();
        while(s1.length()>0){
            char ch=s1.charAt(0);
            String s2=s1.replace(ch+ "", "");
            int count=s1.length()-s2.length();
            if(count<mincount1){
                mincount2=mincount1;
                mincount1=count;
                minchar2=minchar1;
                minchar1=ch;
            }
            else if(count<mincount2&&count!=mincount1){
                mincount2=count;
                minchar2=ch;
            }
            s1=s2;
        }
        System.out.println(minchar2+"="+mincount2);
    }
}
