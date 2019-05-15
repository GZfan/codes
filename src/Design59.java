import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Design59
 * @Description leetcode 155
 * @Author GZfan
 * @Date 19-5-15
 */
public class Design59 {
    ArrayList array=new ArrayList();
    public Design59() {

    }

    public void push(int x) {
        array.add(x);
    }

    public void pop() {
        array.remove(array.size()-1);
    }

    public int top() {
        return (int)array.get(array.size()-1);
    }

    public int getMin() {
        int min=Integer.MAX_VALUE;
        int len = array.size();
        for(int i=0;i<len;i++){
            if((int)array.get(i)<min){
                min=(int)array.get(i);
            }
        }
        return min;
    }
}
