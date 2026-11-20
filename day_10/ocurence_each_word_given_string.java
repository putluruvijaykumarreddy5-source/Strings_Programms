package Strings.day_10;

public class ocurence_each_word_given_string {
    public static void main(String[] args){
        String s="  I Love My India ";
        String[] str=s.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i]=="")continue;
            int count=1;
            for(int j=i+1;j<str.length;j++){
                if(str[i].equals(str[j])){
                    count++;
                    str[j]="";
                }
            }
            System.out.println(str[i]+"=="+count);
        }
    }
}
