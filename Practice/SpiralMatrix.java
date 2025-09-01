package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {

    public List<Integer> spiral(int[][] matrix){
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) return list;
        int rowst = 0;
        int colst = 0;
        int rowend = matrix.length;
        int colend = matrix[0].length;
        while (rowst < rowend && colst < colend) {
            for (int i = colst; i < colend; i++) {
                list.add(matrix[rowst][i]);
            }
            rowst++;
            for (int i = rowst; i < rowend; i++) {
                list.add(matrix[i][colend - 1]);
            }
            colend--;
            if (rowst < rowend) {
                for (int i = colend - 1; i >= colst; i--) {
                    list.add(matrix[rowend - 1][i]);
                }
                rowend--;
            }
            if (colst < colend) {
                for (int i = rowend - 1; i >= rowst; i--) {
                    list.add(matrix[i][colst]);
                }
                colst++;
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
        SpiralMatrix sm=new SpiralMatrix();
        System.out.println(sm.spiral(nums));
        
    }
    
}
