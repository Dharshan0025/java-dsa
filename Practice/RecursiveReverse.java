package Practice;

import java.util.Scanner;

public class RecursiveReverse {
    public String reverse(String str){
        String[] arr=str.split(" ");
        int m=arr.length;
        int n=str.length();
        if(str.equals(arr[0])){
            return arr[0];
        }
        return arr[m-1]+" "+reverse(str.substring(0,n-arr[m-1].length()-1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        RecursiveReverse rr=new RecursiveReverse();
        System.out.println(rr.reverse(str));
        
    }

}
