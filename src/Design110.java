import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @ClassName Design110
 * @Description leetcode 380
 * @Author GZfan
 * @Date 19-6-9
 */
public class Design110 {

    private Set<Integer> set;
    private List<Integer> list;
    ThreadLocalRandom ran;
    /** Initialize your data structure here. */
    public Design110() {
        set=new HashSet<>();
        list=new ArrayList<>();
        ran=ThreadLocalRandom.current();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(set.contains(val)){
            return  false;
        } else {
            set.add(val);
            list.add(val);
            return true;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            list.remove(list.indexOf(val));
            return true;
        } else {
            return false;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {
        int i=ran.nextInt(0,list.size());
        return list.get(i);
    }
}
