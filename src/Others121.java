/**
 * @ClassName Others121
 * @Description leetcode 169
 * @Author GZfan
 * @Date 19-6-17
 */
public class Others121 {
    public int majorityElement(int[] nums) {
        int set=0;
        int[] times=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int j=0;
            for(;j<=set;j++){
                if(nums[i]==nums[j]){
                    times[j]++;
                    break;
                }
            }
            if(j==set+1){
                set++;
                nums[set]=nums[i];
                times[set]++;
            }
        }
        int max=0;
        for(int i=0;i<=set;i++){
            if(times[i]>times[max]){
                max=i;
            }
        }
        return nums[max];
    }
}
