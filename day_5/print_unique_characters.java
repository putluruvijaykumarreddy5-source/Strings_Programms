package Strings.day_5;

public class print_unique_characters {
    public static void main(String[] args){
        String s="javadev";
        String res="";
        char [] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]=='\u0000') continue;
            int count=1;
            for(int j=i+1;j<s.length();j++){
                if(ch[i]==ch[j]){
                    count++;
                
                    ch[j]='\u0000';
                }
            }
            if(count==1)
                System.out.println(ch[i]);
        }
    }
}
