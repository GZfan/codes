/**
 * @ClassName Array79
 * @Description
 * @Author GZfan
 * @Date 19-5-24
 */
public class Array79 {
    private static String sub;
    private static int maxLen;
    private static boolean doubleCore;
    public String longestPalindrome(String s) {
        char[] str=s.toCharArray();
        int len=s.length();
        if(len==0||len==1){
            return s;
        }
        sub=null;
        maxLen=0;
        doubleCore=false;
        for (int i = 1; i <len-maxLen/2 ; i++) {
            longest(str,i,i,i);
        }
        return sub;
    }
    private  static void longest(char[] str,int i,int front,int tail){
        if(!doubleCore&&str[i-1]==str[i]){
            doubleCore=true;
            longest(str,i,i-2,i+1);
            doubleCore=false;
        }
        while(front>=0&&tail<str.length&&str[front]==str[tail]){
            front--;
            tail++;
        }
        if(tail-front-1>maxLen){
            maxLen=tail-front-1;
            sub=new String(str,front+1,maxLen);
        }
    }
}
