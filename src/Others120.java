import java.util.HashSet;
import java.util.LinkedList;

/**
 * @ClassName Others120
 * @Description
 * @Author GZfan
 * @Date 19-6-16
 */
public class Others120 {
    public int evalRPN(String[] tokens) {
        LinkedList<String> stack=new LinkedList<>();
        String t1,t2;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")) {
                t1 = stack.pop();
                t2 = stack.pop();
                if (tokens[i].equals("+")) {
                    stack.push(String.valueOf(Integer.valueOf(t1) + Integer.valueOf(t2)));
                } else if (tokens[i].equals("-")) {
                    stack.push(String.valueOf(Integer.valueOf(t2) - Integer.valueOf(t1)));
                } else if (tokens[i].equals("*")){
                    stack.push(String.valueOf(Integer.valueOf(t1) * Integer.valueOf(t2)));
                }
                else {
                    stack.push(String.valueOf(Integer.valueOf(t2) / Integer.valueOf(t1)));
                }
            } else {
                stack.push(tokens[i]);
            }
        }
        return Integer.parseInt(stack.pop());
    }

}
