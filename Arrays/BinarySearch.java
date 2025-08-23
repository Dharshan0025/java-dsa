import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

 public int search(int [] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
 }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int[] nums=new int[size];
      System.out.println("Enter the target value:");
      int target=sc.nextInt();
      for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
      }
      BinarySearch ob=new BinarySearch();
      int res=ob.search(nums,target);
      System.out.println(res);
    }
}
