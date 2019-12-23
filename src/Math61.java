import java.util.Arrays;

/**
 * @ClassName Math61
 * @Description leetcode 204
 * @Author GZfan
 * @Date 19-5-16
 */
public class Math61 {


    public int countPrimes(int n) {
        boolean[] prime=new boolean[n+1];
        if (n == 0 || n == 1 || n == 2) {
            return 0;
        }
        int count=1;
        Arrays.fill(prime,true);
        for (int i = 4; i < n ; i=i+2) {
            prime[i]=false;
        }
        for (int i = 3; i <n ; i=i+2) {
            if(prime[i]){
                for(int j=2,num=j*i;num<n;j++,num=j*i){
                    prime[num]=false;
                }
                count++;
            }
        }
        return count;
    }




}
