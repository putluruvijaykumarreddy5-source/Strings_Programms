package Strings.day_5;

public class accurance_of_values_remove {
    public static void main(String[] args) {
        String s="java dev";
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            int count=1;
            if(ch[i]=='\u0000'||ch[i]==' ')
                continue;
            for(int j=i+1;j<s.length();j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]='\u0000';
                }
            }
            System.out.println(ch[i]+" = "+count);


        }
    }
}
