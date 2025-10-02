package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesString {

    public String remove(String str){
        StringBuilder sb=new StringBuilder();
        int[] freq=new int[36];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isAlphabetic(ch)){
               freq[ch-'a']++;
            }else{
                int num=ch-'0';
                freq[num+26]++;
            }
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
            if(Character.isDigit(ch)){
                int num=ch-'0';
                if(freq[num+26]==1){
                    sb.append(ch);
                }else{
                    freq[num+26]--;
                }
            }else{
                if(freq[ch-'a']>0){
                    sb.append(ch);
                    freq[ch-'a']=0;
                }
            }
        }
        System.out.println(Arrays.toString(freq));
        return sb.toString();

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        RemoveDuplicatesString ob=new RemoveDuplicatesString();
        System.out.println(ob.remove(str));
        
        
    }
}
