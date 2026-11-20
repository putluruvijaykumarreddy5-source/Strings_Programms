package Strings.day_1;

public class print_lcc_ucc_nc_scc {
    public static void main(String[] args){
        String s="Vijay@2005";
        int lc=0;
        int uc=0;
        int sc=0;
        int nc=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z')
                lc++;
                
            
            else if(ch>='A'&&ch<='Z')
                uc++;

            
            else if(ch>='0'&&ch<='9')
                nc++;
            
            else{
                sc++;
            }
        }
        System.out.println("Lower count="+lc);
        System.out.println("Upper count="+uc);
        System.out.println("Number count="+nc);
        System.out.println("Special count="+sc);
    }
}
