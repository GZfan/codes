import java.util.HashMap;

/**
 * @ClassName Math118
 * @Description leetcode 166
 * @Author GZfan
 * @Date 19-6-13
 */
public class Math118 {
    public String fractionToDecimal(int numerator, int denominator) {
        if(denominator==0)
            return "NaN";
        if(numerator==0)
            return "0";
        StringBuilder sb=new StringBuilder();
        Boolean sign=(numerator>=0)^(denominator>=0);
        if(sign)
            sb.append('-');
        long n=Math.abs((long)numerator);
        long d=Math.abs((long)denominator);
        sb.append(Math.abs(n/d));
        n-=n/d*d;
        if(n==0)
            return sb.toString();
        sb.append('.');
        HashMap<Long, Integer> map=new HashMap<Long, Integer>();
        n*=10;
        map.put(n, sb.length());
        while(true)
        {
            long s=n/d;
            sb.append(s);
            n-=s*d;
            if(n==0)
                return sb.toString();
            n*=10;
            if(map.containsKey(n))
            {
                sb.append(')');
                sb.insert((int)map.get(n),'(');
                break;
            }
            else
            {
                map.put(n, sb.length());
            }
        }
        return sb.toString();
    }
}
