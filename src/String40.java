/**
 * @ClassName String40
 * @Description leetcode14
 * @Author GZfan
 * @Date 19-4-30
 */
public class String40 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder answer=new StringBuilder("");
        int len=strs.length;
        int minLen=Integer.MAX_VALUE;
        if(len==0)
            return "";
        Boolean end=false;
        for(String t:strs){
            if(t.length()<minLen)
                minLen=t.length();
        }
        for(int i=0;i<minLen&&!end;i++){
            for(int j=0;j<len;j++){
                if(strs[j].charAt(i)!=strs[0].charAt(i)){
                    end=true;
                    return answer.toString();
                }
            }
            answer.append(strs[0].charAt(i));
        }
        return answer.toString();
    }
}
