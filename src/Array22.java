/**
 * @ClassName Array22
 * @Description leetcode 122
 * @Author GZfan
 * @Date 19-4-18
 */
public class Array22 {
    public int maxProfit(int[] prices) {
        int in=0,out=0,profit=0;
        if(prices.length==1)
            return 0;
        else {
            for(;out<prices.length;)
            {
                while(out+1<prices.length&&prices[out]<prices[out+1])
                    out++;
                profit=profit+prices[out]-prices[in];
                in=++out;
                while(in+1<prices.length&&prices[in]>prices[in+1])
                    in++;
                out=in;
            }
        }
        return profit;
    }
}
