import jdk.nashorn.internal.runtime.arrays.NumericElements;

import java.math.BigInteger;

/**
 * @ClassName String37
 * @Description leetcode 8  其实可以用Long 的 我真傻，真的。
 * @Author GZfan
 * @Date 19-4-29
 */
public class String37 {
    public int myAtoi(String str) {
        char[] temp=str.toCharArray();
        int len= temp.length;
        if(len==0)
            return 0;
        int i=0;
        for(;i<len&&temp[i]==' ';i++);
        if(i==len)
            return 0;
        Boolean positive=true;
        if(temp[i]=='-'){
            positive=false;
            if(++i<len&&!isNum(temp[i]))
                return 0;
        }
        else if(temp[i]=='+'){
            if(++i<len&&!isNum(temp[i]))
                return 0;
        }
        else if(isNum(temp[i])){
        }
        else return 0;
        int num=0,numlen=0;
        for(;i<len&&isNum(temp[i]);i++){
            num=num*10+(temp[i]-'0');
            if(num!=0)
                numlen++;
            if(numlen==9&&i+1<len&&isNum(temp[i+1])){
                BigInteger bigNum=BigInteger.valueOf(num);
                bigNum=bigNum.multiply(BigInteger.valueOf(10));
                bigNum=bigNum.add(BigInteger.valueOf(temp[++i]-'0'));
                if(!positive)
                    bigNum=bigNum.multiply(BigInteger.valueOf(-1));
                i++;
                if((positive&&bigNum.compareTo(BigInteger.valueOf(Integer.MAX_VALUE))>0)||((i<len)&&(isNum(temp[i])&&positive)))
                    return Integer.MAX_VALUE;
                else if(bigNum.compareTo(BigInteger.valueOf(Integer.MIN_VALUE))<0||((i<len)&&(isNum(temp[i]))))
                    return Integer.MIN_VALUE;
                return bigNum.intValue();
            }
        }
        if(positive)
            return num;
        else
            return 0-num;

    }
    private static Boolean isNum(char t){
        if(t>='0'&&t<='9')
            return true;
        else
            return false;
    }
}
