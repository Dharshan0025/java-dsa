import java.util.Scanner;

public class MatrixLargest {
    public int largest(int[][] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(max<nums[i][j]){
                    max=nums[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter no of rows");
        int rows=in.nextInt();
        System.out.println("enter no of cols");
        int cols=in.nextInt();
        int[][] nums=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                nums[i][j]=in.nextInt();
            }
        }
        MatrixLargest maximum=new MatrixLargest();
        System.out.println(maximum.largest(nums));



    }
}
