package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ZigZagMatrix {
    public List<Integer> zigzag(int[][] nums){
        List<Integer>list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
          int pt1=0;
          int pt2=i;
          if(i%2==0){
            while(pt2>=0 && pt1<=i){
               list.add(nums[pt2--][pt1++]);
            }
          } 
          else{
            while(pt1<=i && pt2>=0){
                list.add(nums[pt1++][pt2--]);
               
            }
          }
        }

        return list;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows");
        int row=sc.nextInt();
        System.out.println("enter no of col");
        int col=sc.nextInt();
        int[][] nums=new int[row][col];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        ZigZagMatrix zz=new ZigZagMatrix();
        System.out.println((zz.zigzag(nums)));
        
    }
}
