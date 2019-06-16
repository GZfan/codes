import java.math.BigInteger;

/**
 * @ClassName Others119
 * @Description leetcode 371
 * @Author GZfan
 * @Date 19-6-16
 */
public class Others119 {
    public int getSum(int a, int b) {
        StringBuilder aBi=new StringBuilder(Integer.toBinaryString(a));
        StringBuilder bBi=new StringBuilder(Integer.toBinaryString(b)) ;
        StringBuilder res=new StringBuilder(32);
        int count=0;
        int len1=aBi.length(),len2=bBi.length();
        if(a>=0){
            char[] t1=new char[32-len1];
            for (int i = 0; i <t1.length ; i++) {
                t1[i]='0';
            }
            aBi.insert(0,t1);
        }
        if(b>=0){
            char[] t2=new char[32-len2];
            for (int i = 0; i <t2.length ; i++) {
                t2[i]='0';
            }
            bBi.insert(0,t2);
        }
        for(int i=aBi.length()-1;i>=0;i--){
            int t1=aBi.charAt(i)-'0',t2=bBi.charAt(i)-'0';
            res.append(t1^t2^count);
            count=(t1&t2)|(count&(t1|t2));
        }

        BigInteger ans=new BigInteger(new String(res.reverse()), 2);
        return ans.intValue();
    }
}
