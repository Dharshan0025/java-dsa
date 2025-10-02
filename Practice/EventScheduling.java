package Practice;

import java.util.Scanner;

public class EventScheduling {

    public int count(int[][] nums){
        

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
        EventScheduling es=new EventScheduling();
        System.out.println(es.count(nums));
    }
}
