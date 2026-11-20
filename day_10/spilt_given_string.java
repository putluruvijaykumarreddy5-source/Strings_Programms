package Strings.day_10;

public class spilt_given_string {
    public static void main(String[] args){
        String s="java is very easy";
        String [] str=s.split(" ");
        System.out.println(str[0]);
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
        System.out.println("=========");
        for(int j=str.length-1;j>=0;j--){
            System.out.println(str[j]);
        }
    }
}
