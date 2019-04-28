/**
 * @ClassName String35
 * @Description leetcode 242
 * @Author GZfan
 * @Date 19-4-28
 */
public class String35 {
    public boolean isAnagram(String s, String t) {
        int len1=s.length();
        int len2=t.length();
        if(len1!=len2)
            return false;
        int[] sChar=new int[26];
        int[] tChar=new int[26];
        for(int i=0;i<len1;i++){
            sChar[s.charAt(i)-'a']++;
            tChar[t.charAt(i)-'a']++;
        }
        for(int j=0;j<26;j++){
            if(sChar[j]!=tChar[j])
                return false;
        }
        return true;

    }
}
