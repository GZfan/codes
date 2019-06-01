/**
 * @ClassName Sorting96
 * @Description leetcode 75
 * @Author GZfan
 * @Date 19-6-1
 */
public class Sorting96 {
    public void sortColors(int[] nums) {
        int[] count={0,0,0};
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        for(int i=0,j=0;j<3&&i<nums.length;i++){
            while(j<3&&count[j]==0){
                j++;
            }
            nums[i]=j;
            count[j]--;
        }

    }

}
