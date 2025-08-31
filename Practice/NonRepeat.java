package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class NonRepeat {
    public int repeat(String s){
        s=s.toLowerCase();
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freq[ch-'a']==1){
              return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      NonRepeat ob=new NonRepeat();
      System.out.println(ob.repeat(str));

    }
    
}
