package Practice;

import java.util.HashSet;

/*
 * Remove the duplicates in the String.
Testcase 1:
Input: Java1234
Output: Javb1234 (Remove the second ‘a’ as it is duplicated)
Testcase 2:
Input: Python1223:
Output: Python1234 (Replace the second 2 with 3, and replace 3 with 4 as 3 is replaced for the duplicated 2)
Testcase 3:
Input: aBuzZ9900
Output: aBuzC9012
(Replace the second ‘Z’ with ‘C’ as ‘a’ and ‘B’ are already there in the String. Replace with capital C as the letter to be replaced is capital Z.
 The second 9 turns out to be zero and the zero turns out to ‘1’ and the second zero turns out to ‘2’)
  
 */
public class RemoveDuplicates {

    public String removedup(String s){
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        HashSet<Character>set=new HashSet<>();
        char rep='a'; char n='0'; 
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!set.contains(ch)){
                sb.append(ch);
                set.add(ch);
            }else{
                if(Character.isDigit(ch)){
                  char replace='0';
                  while(set.contains(replace)){
                    replace++;
                  }
                  sb.append(replace);
                  set.add(replace);
                }else if(Character.isLetter(ch)){
                  char replace='a';
                  while(set.contains(replace)){
                    replace++;
                  }
                  sb.append(replace);
                  set.add(replace);
                }else{
                    sb.append(ch);
                }
            }
        }
        
        return toogle(sb,s).toString();

    }
    private StringBuilder toogle(StringBuilder sb,String s){
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>=65 && ch<=90){
                char rep=sb.charAt(i);
                sb.setCharAt(i, Character.toUpperCase(rep));
            }
        }
        return sb;

    }

    public static void main(String[] args) {
        RemoveDuplicates rd=new RemoveDuplicates();
        System.out.println(rd.removedup("aBuzZ9900"));
        System.out.println(rd.removedup("Java1234"));
        System.out.println(rd.removedup("Python1223"));

        
    }
    
}
