import java.util.HashMap;

/**
 * @ClassName Math114
 * @Description
 * @Author GZfan
 * @Date 19-6-10
 */
public class Math114 {

    public int titleToNumber(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int ret = 0;
        for(char c:s.toCharArray()){
            ret = ret * 26 + c - 'A' + 1;
        }
        return ret;
    }

}
