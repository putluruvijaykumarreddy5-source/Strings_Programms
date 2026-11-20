package Strings.day_11;

public class print_smallest_word {
    public static void main(String[] args) {
        String s="java is programming";
        String []str=s.split(" ");
        String smallest=str[0];
        for(int i=1;i<str.length;i++){
            if(str[i].length()<smallest.length()){
                smallest=str[i];
            }
        }
        System.out.println(smallest);
    }
}
