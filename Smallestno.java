import java.util.Scanner;

public class Smallestno{
    public int smallest(int[] nums){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int[] nums=new int[size];
      for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
      }
      Smallestno ob=new Smallestno();
      int res=ob.smallest(nums);
      System.out.println("the smallest is: "+res);

    }
}