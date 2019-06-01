
import java.util.*;

/**
 * @ClassName Backtracking94
 * @Description
 * @Author GZfan
 * @Date 19-5-31
 */
public class Backtracking94 {
    List<List<Integer>> out = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<List> list = new ArrayList<>();
        subsets(nums, 0, list);
        return out;
    }

    void subsets(int [] nums, int index, List list){
        out.add(new ArrayList(list));
        if(index == nums.length){
            return;
        }
        for(int i = index; i < nums.length; i++){
            list.add(nums[i]);
            subsets(nums, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
