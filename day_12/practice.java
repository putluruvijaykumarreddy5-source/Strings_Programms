package day_12;

public class practice {
   public static void main(String[] args){
    String s="india";
    char ch=s.toCharArray();
    for(int i=0;i<s.length();i++){
        for(int j=0;j<s.length()-1-i;j++){
            if(ch[j]<ch[j+1]){
                int temp=ch[j];
                ch[j]=ch[j+1];
                
            }
        }
    }
   } 
}
