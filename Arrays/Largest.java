import java.util.Scanner;

public class Largest{
    public int largest(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int[] nums=new int[size];
      for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
      }
      Largest ob=new Largest();
      int res=ob.largest(nums);
      System.out.println("the largest is: "+res);

    }
}