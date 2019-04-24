import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Array29
 * @Description leetcode 1
 * @Author GZfan
 * @Date 19-4-24
 */
public class Array29 {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            map.put(i, nums[i]);
        }
        Arrays.sort(nums);
        int[] answer=new int[2];
        for(int i=0,j=nums.length-1;i<j;){
            int temp=nums[i]+nums[j];
            if(temp<target){
                i++;
            } else if(temp>target){
                j--;
            }else{
                Boolean see=true;
                for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                    if(see&entry.getValue()==nums[i]) {
                        answer[0] = entry.getKey();
                        see=false;
                    }
                    else if(entry.getValue()==nums[j])
                        answer[1]=entry.getKey();
                }
                break;
            }
        }
        return answer;
    }
}
