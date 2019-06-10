/**
 * @ClassName Math113
 * @Description leetcode 172
 * @Author GZfan
 * @Date 19-6-10
 */
public class Math113 {
    public int trailingZeroes(int n) {
        int count=0,num=1;
        while(num<n){
            num*=5;
            count++;
        }
        return count;
    }
}
