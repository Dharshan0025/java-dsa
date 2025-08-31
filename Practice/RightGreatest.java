package Practice;

import java.util.Arrays;
import java.util.Scanner;

/* Replace every element with the greatest element on right side

Given an array of integers, replace every element with the next greatest element (greatest element on the right side) in the array. 
Since there is no element next to the last element, replace it with -1. 
For example, if the array is {16, 17, 4, 3, 5, 2}, then it should be modified to {17, 5, 5, 5, 2, -1}.
 */
public class RightGreatest {

    public int[] rightGreat(int[] nums){
        int n=nums.length;
        if(n<=1){
            nums[0]=-1;
            return nums;
        }
        int[] res=new int[nums.length];
        int max=0;
        res[n-1]=-1;
        res[n-2]=nums[n-1];
        if(nums[n-1]>nums[n-2]){
            max=nums[n-1];
        }else{
            max=nums[n-2];
        }

        for(int i=n-3;i>=0;i--){
            if(nums[i]<max){
                res[i]=max;
            }else{
                res[i]=max;
                max=nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] nums=new int[size];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        RightGreatest ob=new RightGreatest();
        System.out.println(Arrays.toString(ob.rightGreat(nums)));

    }
    
}
