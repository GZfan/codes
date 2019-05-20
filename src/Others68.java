import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Others68
 * @Description leetcode 20
 * @Author GZfan
 * @Date 19-5-20
 */
public class Others68 {
    public boolean isValid(String s) {
        int len=s.length();
        if (len % 2 == 1) {
            return false;
        }
        if(len==0){
            return true;
        }
        LinkedList<Character> left = new LinkedList<>();
        for (int i = 0; i < len ; i++) {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                left.push(s.charAt(i));
            } else {
                if(left.size()==0||judge(left.pop())+judge(s.charAt(i))!=0){
                    return false;
                }
            }
        }
        if(left.size()>0){
            return false;
        }
        return true;
    }

    private static int judge(char c) {
        int value = 0;
        switch (c) {
            case '(': {
                value = 1;
                break;
            }
            case ')': {
                value = -1;
                break;
            }
            case '[': {
                value = 2;
                break;
            }
            case ']': {
                value = -2;
                break;
            }
            case '{': {
                value = 3;
                break;
            }
            case '}': {
                value = -3;
                break;
            }
            default:
        }
        return value;
    }
}
