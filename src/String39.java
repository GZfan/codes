
/**
 * @ClassName String39
 * @Description leetcode 38
 * @Author GZfan
 * @Date 19-4-30
 */
public class String39 {
    public String countAndSay(int n) {
        return count(n);
    }

    private static String count(int n) {
        if(n==1)
            return "1";
        String lastString=count(n-1);
        int flag=0,num=0,len=lastString.length();
        StringBuilder answer=new StringBuilder();
        for(int i=0;i<len&&flag<len;i=flag){
            while(flag<len&&lastString.charAt(i)==lastString.charAt(flag))
                flag++;
            num=flag-i;
            answer.append(num);
            answer.append(lastString.charAt(i));
        }
        return answer.toString();
    }
}
