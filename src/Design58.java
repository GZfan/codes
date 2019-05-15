
import java.util.concurrent.ThreadLocalRandom;
/**
 * @ClassName Design58
 * @Description leetcode 384
 * @author GZfan
 * @date 19-5-15
 */
public class Design58 {
    private int[] nums;
    private int len;
    private ThreadLocalRandom ran=ThreadLocalRandom.current();
    public Design58(int[] nums) {
        this.nums=nums;
        len=nums.length;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] newNum=nums.clone();
        for (int i = 0; i <len ; i++) {
            int j=ran.nextInt(i,len);
            int temp=newNum[j];
            newNum[j]=newNum[i];
            newNum[i]=temp;
        }
        return newNum;
    }
}
