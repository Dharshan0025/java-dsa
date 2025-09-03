package Practice;

import java.util.Scanner;

public class Version {

    public String compare(String v1,String v2){
        String str=v1+" "+v2;
        String[] arr=str.split(" ");
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        System.out.println(arr[1]);
        System.out.println(arr[3]);
    
        
        
        for(int i=0;i<arr[1].length();i++){
          if(Character.isDigit(arr[1].charAt(i))){
            sb1.append(arr[1].charAt(i));
          }
        }
        for(int i=0;i<arr[3].length();i++){
            if(Character.isDigit(arr[3].charAt(i))){
              sb2.append(arr[3].charAt(i));
            }
        }

        int ver1=Integer.parseInt(sb1.toString());
        int ver2=Integer.parseInt(sb2.toString());


       return ver1>ver2?"downgraded":"upgraded";

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String v1=sc.nextLine();
        String v2=sc.nextLine();
        Version v=new Version();
        System.out.println(v.compare(v1, v2));
    }
    
}
