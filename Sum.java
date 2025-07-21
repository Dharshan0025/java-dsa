import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    
    public int sumofArray(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int[] nums=new int[size];
      for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
      }
      Sum ob=new Sum();
      System.out.println(ob.sumofArray(nums));
    }
}
