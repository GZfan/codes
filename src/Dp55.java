import java.util.ArrayList;

/**
 * @ClassName Dp55
 * @Description leetcode 121
 * @Author GZfan
 * @Date 19-5-11
 */
public class Dp55 {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        if(len==0||len==1)
            return 0;
        ArrayList lowMark=new ArrayList(len);
        lowMark.add(0);
        ArrayList profit=new ArrayList();
        for (int front = 0; front <len ; ) {
            while(front+1<len&&prices[front]<=prices[front+1]){
                front++;
            }
            for(Object mark:lowMark){
                profit.add(prices[front]-prices[(Integer) mark]);
            }
            front++;
            while(front+1<len&&prices[front]>=prices[front+1]) {
                front++;
            }
            lowMark.add(front);
            front++;
        }
        int max=0;
        for(Object pro:profit){
            if((int)pro>max)
                max=(int)pro;
        }
        return max;
    }
}
