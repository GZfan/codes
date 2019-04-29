/**
 * @ClassName String38
 * @Description leetcode 28
 * @Author GZfan
 * @Date 19-4-29
 */
public class String38 {
    public int strStr(String haystack, String needle) {
        int len1=haystack.length();
        int len2=needle.length();
        if(len2==0)
            return 0;
        if(len2>len1)
            return -1;
        char[] temp1=haystack.toCharArray();
        char[] temp2=needle.toCharArray();
        for(int flag1=0;flag1<len1-len2+1;flag1++){
            for(int flag2=0,i=flag1;flag2<len2;flag2++,i++){
                if (temp1[i] != temp2[flag2])
                    break;
                if(flag2==len2-1)
                    return flag1;
            }
        }
        return -1;
    }
}
