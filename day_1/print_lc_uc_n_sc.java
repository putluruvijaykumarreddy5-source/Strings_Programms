INpackage Strings.day_1;

public class print_lc_uc_n_sc {
    public static void main(String[] args){
        String s="Vijay@2005";
        String lc="";
        String uc="";
        String n="";
        String sc="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z'){
                lc+=ch;
            }
            else if(ch>='A'&&ch<='Z'){
                uc+=ch;
            }
            else if(ch>='0'&&ch<='9'){
                n+=ch;
            }
            else{
                sc+=ch;
            }

        }
        System.out.println(lc+uc+n+sc);
    }
}
