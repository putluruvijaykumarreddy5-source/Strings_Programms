package Strings.day_10;

public class remove_duplicates_word {
    public static void main(String[] args) {
        String s="java is very very easy";
        String res="";
        String[] str=s.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i]=="")continue;
            for(int j=i+1;j<str.length;j++){
                if(str[i].equals(str[j])){
                   str[j]="";
            }
        }
        res+=str[i]+" ";
    }
     System.out.println(res.trim()) ;  

    }
}
