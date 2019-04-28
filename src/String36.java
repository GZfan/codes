/**
 * @ClassName String36
 * @Description leetcode 125
 * @Author GZfan
 * @Date 19-4-28
 */
public class String36 {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int len=s.length();
        if(len==0||len==1)
            return true;
        char[] ch=s.toCharArray();
        for(int start=0,end=len-1;start<=end;start++,end--){
            while(start<len&&!valid(ch[start])) start++;
            while(end>=0&&!valid(ch[end])) end--;
            if(start>=len||end<0)
                break;
            if(ch[start]!=ch[end])
                return false;
        }
        return true;
    }
    public static boolean valid(char t){
        if((t>='a'&&t<='z')||(t>='0'&&t<='9'))
            return true;
        else return false;
    }
}
