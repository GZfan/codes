import java.util.*;

/**
 * @ClassName Sorting97
 * @Description leetcode 347
 * @Author GZfan
 * @Date 19-6-2
 */
public class Sorting97 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>(nums.length/2);
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>[] bucket=new List[nums.length+1];
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            Integer value=entry.getValue();
            if(bucket[value]==null){
                bucket[value]=new ArrayList<>();
            }
            bucket[value].add(entry.getKey());
        }
        for(int i=bucket.length-1;i>=0&&result.size()<k;i--){
            if(bucket[i]!=null){
                result.addAll(bucket[i]);
            }
        }
        return result;
    }
}
