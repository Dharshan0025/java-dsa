package Strings;

public class DoubleHashRabinKarp {
    private long hash1Pattern(String str2){
        long hash1=0;
        long m=str2.length();
        for(int i=0;i<str2.length();i++){
            hash1=(hash1+(str2.charAt(i)*(long)Math.pow(26,m-i-1))%101)%101;
        }
        return hash1;

    }
    private long hash2Pattern(String str2){
        long hash2=0;
        long m=str2.length();
        for(int i=0;i<str2.length();i++){
            hash2=(hash2+(str2.charAt(i)*(long)Math.pow(27,m-i-1))%107)%107;
        }
        return hash2;
    }
    
    public long stringMatch(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        long patternHash1=hash1Pattern(str2);
        long patternHash2=hash2Pattern(str2);
        long initial1=hash1Pattern(str1.substring(0,m));
        long initial2=hash2Pattern(str1.substring(0,m));
        if(initial1==patternHash1 && str1.substring(0,m).equals(str2) || initial2==patternHash2 && str1.substring(0,m).equals(str2)){
            return 0;
        }
        for(int i=m;i<n;i++){
            long h1 = (long)Math.pow(26, m - 1) % 101;
            long h2 = (long)Math.pow(27, m - 1) % 107;
            long curr1 = ( ( (initial1 - (str1.charAt(i - m) * h1) % 101 + 101) % 101 ) * 26 ) % 101;
            long curr2 = ( ( (initial2 - (str1.charAt(i - m) * h2) % 107 + 107) % 107 ) * 27 ) % 107;
            curr1 = (curr1 + str1.charAt(i)) % 101;
            curr2 = (curr2 + str1.charAt(i)) % 107;

            if((curr1==patternHash1 && str1.substring(i-m+1,i+1).equals(str2)) || (curr2==patternHash2 && str1.substring(i-m+1,i+1).equals(str2))){
               return i-m+1;
            }
            initial1=curr1;
            initial2=curr2;
        }
        return -1;

    }
    public static void main(String[] args) {
        DoubleHashRabinKarp rb=new DoubleHashRabinKarp();
        System.out.println(rb.stringMatch("laptop", "top"));
    }

    
}
