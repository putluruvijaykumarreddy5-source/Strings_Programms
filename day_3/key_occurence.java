package Strings.day_3;

public class key_occurence {
   public static void main(String[] args){
    String s="javadev";
    char key='v';
    int count=0;
    char []ch=s.toCharArray();
    for(int i=0;i<s.length();i++){
        if(ch[i]==key)
            count++;

    }
    System.out.println(key+" = "+count);
   } 
}
