import java.util.*;

public class FreqCount {

    public void count(int[] nums){
      HashMap<Integer,Integer>map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
          map.put(nums[i],map.get(nums[i])+1);
        } else{
          map.put(nums[i],1);
        }
      }
      for(Map.Entry<Integer,Integer> e:map.entrySet()){
        System.out.println("freq of "+e.getKey()+" is "+e.getValue());
      }
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int[] nums=new int[size];
      for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
      }
      FreqCount fr=new FreqCount();
      fr.count(nums);
    }
}
