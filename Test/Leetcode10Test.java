import org.junit.Test;

public class Leetcode10Test {

    @Test
    public void isMatch() {
        Character a=new Character('a');
        Character b=new Character('a');
        System.out.println(a.equals(b));
        Leetcode10 t=new Leetcode10();
        t.isMatch("aab", "c*a*b");
    }
}