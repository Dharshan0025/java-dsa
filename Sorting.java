import java.util.*;

public class Sorting {

    public int[] increaseDecrease(int[] nums){
        Arrays.sort(nums);
        int[] res=new int[nums.length];
        int k=0;
        int j=nums.length-1;
        for(int i=0;i<nums.length;i++){
           if(i%2==0){
            res[i]=nums[k++];
           }else{
            res[i]=nums[j--];
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
      Sorting ob=new Sorting();
      System.out.println(Arrays.toString(ob.increaseDecrease(nums)));

    }
}
