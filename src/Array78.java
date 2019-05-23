/**
 * @ClassName Array78
 * @Description leetcode 3
 * @Author GZfan
 * @Date 19-5-23
 */
public class Array78 {
    public int lengthOfLongestSubstring(String s) {
        char[] str=s.toCharArray();
        int front=0,tail=0,len=s.length();
        int max=0;
        while(tail<len){
            front=locate(str,front,tail);
            if(tail-front+1>max){
                max=tail-front+1;
            }
            tail++;
        }
        return max;
    }
    private static int locate(char[] str,int front,int tail){
        int i=front;
        while(i<tail){
            if(str[i]==str[tail]){
                return i+1;
            }
            i++;
        }
        return front;
    }
}
