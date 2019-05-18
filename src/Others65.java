/**
 * @ClassName Others65
 * @Description leetcode 461
 * @Author GZfan
 * @Date 19-5-18
 */
public class Others65 {
    public int hammingDistance(int x, int y) {
        return hammingWeight(x^y);
    }
    private static int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
