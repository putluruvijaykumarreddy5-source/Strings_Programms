package Strings.day_5;

public class given_string_number_count {
    public static void main(String[] args){
        String s="Vijay12kumar3";
        int sum=0;
        int num=0;
        char []ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]>='0'&&ch[i]<='9'){
                num=num*10+(ch[i]-'0');
            }
            else{
                sum+=num;
                 num=0;
            }
        }
        sum+=num;
        System.out.println(sum);
    }
}
