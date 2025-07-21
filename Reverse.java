import java.util.*;


public class Reverse {
    public void reverse(int[] nums){
    int i=0;
    int j=nums.length-1;
    while(i<j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
    }
}
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int[] nums=new int[size];
      for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
      }
      Reverse ob=new Reverse();
      ob.reverse(nums);
      System.out.println("the reversed array: "+ Arrays.toString(nums));

    }
}

