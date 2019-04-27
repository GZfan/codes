/**
 * @ClassName String32
 * @Description leetcode 344
 * @Author GZfan
 * @Date 19-4-27
 */
public class String32 {
    public void reverseString(char[] s) {
        for(int i=0,j=s.length-1;i<j;i++,j--){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }
}
