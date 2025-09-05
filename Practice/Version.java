package Practice;

import java.util.Scanner;

/*
 *Print whether the version is upgraded, downgraded or not changed according to the input given.
example: Input : Version1 4.8.2 Version2 4.8.4 Output: upgraded, Input : Version1 4.0.2 Version2 4.8.4 Output: downgraded

 */

public class Version {

    public String compare(String v1,String v2){
        String str=v1+" "+v2;
        String[] arr=str.split(" ");
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        System.out.println(arr[1]);
        System.out.println(arr[3]);
        
        int n=arr[1].length();
        int m=arr[3].length();
        
        int i=0;
        int j=0;
        while(i<n && j<m){
          if(arr[1].charAt(i)>arr[3].charAt(i)){
            return "dowmgraded";
          }else if(arr[1].charAt(i)<arr[3].charAt(i)){
            return "upgraded";
          }else{
            i++;
            j++;
          }

        }
        return "not changed";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String v1=sc.nextLine();
        String v2=sc.nextLine();
        Version v=new Version();
        System.out.println(v.compare(v1, v2));
    }
    
}
