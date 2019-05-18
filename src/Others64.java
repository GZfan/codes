/**
 * @ClassName Others64
 * @Description leetcode 191
 * @Author GZfan
 * @Date 19-5-18
 */
public class Others64 {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
