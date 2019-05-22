import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Array75
 * @Description leetcode 15
 * @Author GZfan
 * @Date 19-5-22
 */
public class Array75 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> pair = new ArrayList<>();
        int len=nums.length;
        if(len<3){
            return pair;
        }
        Arrays.sort(nums);
        for (int i = 0; i <len-2 ; ) {
            int start = i + 1;
            int end= len-1;
            while(start<end){
                if(nums[start]+nums[end]==-nums[i]){
                    List<Integer> line=new ArrayList<>(3);
                    line.add(nums[start]);
                    line.add(nums[end]);
                    line.add(nums[i]);
                    pair.add(line);
                    start++;
                    end--;
                    while(start<end&&nums[start]==nums[start-1]){
                        start++;
                    }
                    while(start<end&&nums[end]==nums[end+1]){
                        end--;
                    }
                } else if (nums[start]+nums[end] > -nums[i]){
                    end--;
                    while(start<end&&nums[end]==nums[end+1]){
                        end--;
                    }
                } else if (nums[start] + nums[end] <-nums[i]){
                    start++;
                    while(start<end&&nums[start]==nums[start-1]){
                        start++;
                    }
                }
            }
            i++;
            while(nums[i]==nums[i-1]&&i<len-2){
                i++;
            }
        }
        return pair;
    }
}
