import java.util.Arrays;
import java.util.Scanner;

public class Rotatek {
    public int[] rotate(int[] nums,int k){
       if(k==0 || k==1){
         return nums;
       }
       if(k>nums.length){
        k=k%nums.length;
       }
       

    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int[] nums=new int[size];
      for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
      }
      System.out.println("enter k");
      int k=sc.nextInt();
      Rotatek ob=new Rotatek();
      System.out.println(Arrays.toString(ob.rotate(nums,k)));
}
}
