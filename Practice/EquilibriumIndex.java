package Practice;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. For example, in an array A:
Example :
Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
Output: 3
3 is an equilibrium index, because:
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
Input: A[] = {1, 2, 3}
Output: -1

 */
public class EquilibriumIndex {
    public int equIndex1(int[] nums){
        int n=nums.length;
        if(n==1){
           return nums[0];
        }
        int[] pref_arr=new int[n];
        int[] suff_arr=new int[n];
        int prefix_sum=0;
        int suffix_sum=0;
        for(int i=0;i<nums.length;i++){
            prefix_sum+=nums[i];
            pref_arr[i]=prefix_sum;
            suffix_sum+=nums[(n-1)-i];
            suff_arr[(n-1)-i]=suffix_sum;
        }
        System.out.println(Arrays.toString(pref_arr));
        System.out.println(Arrays.toString(suff_arr));
        for(int i=0;i<nums.length;i++){
            if(pref_arr[i]==suff_arr[i]){
                return i;
            }
        }
       return -1;
    }
    public int equIndex2(int[] nums){
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<nums.length;i++){
          rightsum=sum-leftsum-nums[i];
          if(leftsum==rightsum){
            return i;
          }
          leftsum+=nums[i];
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        EquilibriumIndex ei=new EquilibriumIndex();
        System.out.println(ei.equIndex1(nums));
        System.out.println(ei.equIndex2(nums));
        
    }
    
}
