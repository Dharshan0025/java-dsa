import java.util.Scanner;

public class SecondLarge {
    public int second(int[] nums){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max1){
               max2=max1;
               max1=nums[i];
               
            }
            else if(nums[i]>max2){
                max2=nums[i];
            }
        }
        return max2;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int[] nums=new int[size];
      for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
      }
      SecondLarge ob=new SecondLarge();
      int res=ob.second(nums);
      System.out.println("the second largest is: "+res);

    }
}

