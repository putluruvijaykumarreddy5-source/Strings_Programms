chpackage Strings.day_8_occurence_programs;

public class second_max_occurence {
    public static void main(String[] args) {
        String s1="aabbbc";
        char maxchar1=' ';
        char maxchar2=' ';
        int maxcount1=0;
        int maxcount2=0;
        while(s1.length()>0){
            char ch=s1.charAt(0);
            String s2=s1.replace(ch+"", "");
            int count=s1.length()-s2.length();
            if(count>maxcount1){
                maxcount2=maxcount1;
                maxcount1=count;
                maxchar2=maxchar1;
                maxchar1=ch;

            }
            else if(count>maxcount2&&count!=maxcount1)
            {
                maxcount2=count;
                maxchar2=ch;
            }
            s1=s2;
            

        }
        System.out.println(maxchar2+"="+maxcount2);
    }
}
