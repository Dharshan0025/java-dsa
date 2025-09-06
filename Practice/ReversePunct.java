package Practice;

import java.util.Scanner;

/*
 * Given a string, we have to reverse the string without changing the position of punctuations and spaces.
 
Sample:   house no : 123@ cbe 
Output:    ebc32 1o :  nes@ uoh 

 */
public class ReversePunct {

    public String reverse(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isAlphabetic(ch) || Character.isDigit(ch) || Character.isWhitespace(ch)){
                sb.append(ch);
            }
        }
        sb.reverse();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!Character.isAlphabetic(ch) && !Character.isDigit(ch) && !Character.isWhitespace(ch)){
                sb.insert(i,ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ReversePunct rp=new ReversePunct();
        System.out.println(rp.reverse(str));
        
    }
    
}
