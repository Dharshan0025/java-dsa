package Practice;

/*
  Given a Boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 then make its adjacent cells as 0.
 */

import java.util.Arrays;
import java.util.Scanner;

public class AdjacentMatrix {
    public int[][] setAdjacentBy(int[][] nums){
        int rows=nums.length;
        int cols=nums[0].length;
        int[][] res=new int[rows][cols];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                res[i][j]=nums[i][j];
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(nums[i][j]==1){
                    if((i-1)>=0){
                        res[i-1][j]=0;
                    }
                    if((i+1)<rows){
                        res[i+1][j]=0;
                    }
                    if((j-1)>=0){
                        res[i][j-1]=0;
                    }
                    if((j+1)<cols){
                        res[i][j+1]=0;
                    }
                }
            }
        }
        
        return res;

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
        AdjacentMatrix am=new AdjacentMatrix();
        System.out.println(Arrays.deepToString(am.setAdjacentBy(nums)));
        
    }
}
