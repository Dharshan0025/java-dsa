import java.util.Scanner;

public class SecondSmall {
    public int second(int[] nums){
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min1){
               min2=min1;
               min1=nums[i];
               
            }
            else if(nums[i]<min2){
                min2=nums[i];
            }
        }
        return min2;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int[] nums=new int[size];
      for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
      }
      SecondSmall ob=new SecondSmall();
      int res=ob.second(nums);
      System.out.println("the second smallest is: "+res);

    }
}

