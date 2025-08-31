
// Arrange array elements in the descending order of their frequency


package Practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CountSort {
    public int[] sort(int[] nums){
      int[] res=new int[nums.length];
      List<Integer>[] bucket=new List[nums.length+1];
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }
      for(Integer key:map.keySet()){
        int idx=map.get(key);
        if(bucket[idx]==null){
            bucket[idx]=new ArrayList<>();
        }
        bucket[idx].add(key);
      }
      int index=0;
      for(int i=bucket.length-1;i>=0;i--){
        if(bucket[i]!=null){
            for(int j=0;j<bucket[i].size();j++){
                int cnt=i;
                int val=bucket[i].get(j);
                while(cnt>0){
                  res[index++]=val;
                  cnt--;
                }
            }
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
      CountSort ob=new CountSort();
      System.out.println(Arrays.toString(ob.sort(nums)));

    }
}
