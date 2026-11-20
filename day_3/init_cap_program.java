package Strings.day_3;

public class init_cap_program {
    public static void main(String[] args) {
        String s="i love india";
        char []ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
        if(i==0||ch[i-1]==' ')
            if(ch[i]>='a'&&ch[i]<='z')
                ch[i]-=32;
        }
        System.out.println(ch);

    }
    
}
