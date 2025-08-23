package Strings;

public class RabinKarp {

    private long hashPattern(String str2){
        long hash=0;
        long m=str2.length();
        for(int i=0;i<str2.length();i++){
            hash+=(str2.charAt(i)*(long)Math.pow(26,m-i-1));
        }
        return hash;

    }
    
    public long stringMatch(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        long patternHash=hashPattern(str2);
        long initial=hashPattern(str1.substring(0,m));
        if(initial==patternHash && str1.substring(0,m).equals(str2) ){
            return 0;
        }
        for(int i=m;i<n;i++){
            long curr=(initial-(str1.charAt(i-m))*(long)Math.pow(26,m-1))*26 + str1.charAt(i);
            if(curr==patternHash && str1.substring(i-m+1,i+1).equals(str2) ){
               return i-m+1;
            }
            initial=curr;
        }
        return -1;

    }
    public static void main(String[] args) {
        RabinKarp rb=new RabinKarp();
        System.out.println(rb.stringMatch("laptop", "top"));
    }
}
