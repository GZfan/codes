import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @ClassName Sorting101
 * @Description leetcode 56
 * @Author GZfan
 * @Date 19-6-4
 */
public class Sorting101 {
    public int[][] merge(int[][] intervals) {
        ArrayList<Item> nums=new ArrayList<>();
        for(int[] inter:intervals){
            nums.add(new Item(inter[0],inter[1]));
        }
        Collections.sort(nums, Comparator.comparingInt(Item::getStart));
        int left=0;
        Item temp;
        for (int i = 1; i < nums.size(); ) {
            temp=nums.get(i);
            if(temp.end<=nums.get(left).end){
                nums.remove(i);
            } else if(temp.start>nums.get(left).end){
                i++;
                left++;
            } else {
                nums.get(left).end=nums.get(left).end>temp.end?nums.get(left).end:temp.end;
                nums.remove(i);
            }
        }
        int[][] res=new int[nums.size()][2];
        for (int i = 0; i < res.length ; i++) {
            res[i][0]=nums.get(i).start;
            res[i][1]=nums.get(i).end;
        }
        return res;
    }
    class Item{
        public Item(int start,int end){
            this.start=start;
            this.end=end;
        }
        public int start;
        public int end;
        public int getStart(){
            return start;
        }
    }
}

