import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Math112
 * @Description
 * @Author GZfan
 * @Date 19-6-9
 */
public class Math112 {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        int num=n;
        while(true){
            num=cout(num);
            if(num==1){
                return true;
            } else if(set.contains(num)){
                break;
            }
            set.add(num);
        }
        return false;
    }
    private int cout(int n){
        int num=0,temp=0;
        while(n!=0){
            temp=n%10;
            n=n/10;
            num+=temp*temp;
        }
        return num;
    }
}
