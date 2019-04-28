import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName String34
 * @Description leetcode 387
 * @Author GZfan
 * @Date 19-4-28
 */
public class String34 {
    public int firstUniqChar(String s) {
        char[] temp=s.toCharArray();
        int len=temp.length;
        Map<Integer,Character> map=new HashMap<>();
        for(int i=0;i<len;i++){
            map.put(i, temp[i]);
        }
        for(int j=0;j<len;j++){
            map.remove(j);
            if(!map.containsValue(temp[j])){
                return j;
            }
            map.put(j, temp[j]);
        }
        return -1;

    }
}
