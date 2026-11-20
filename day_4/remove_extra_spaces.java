package Strings.day_4;
public class remove_extra_spaces {
    public static void main(String[] args) {
        String s="    Vijay   kumar    reddy  ";
        String res="";
        char [] ch =s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]!=' '){
                res+=ch[i];
            }
            else{
                if(i>0 && ch[i-1]!=' '){
                    res+=ch[i];
                }
            }
        }
        System.out.println(res.trim());
    }
}
