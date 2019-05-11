import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Dp54Test {

    @Test
    void climbStairs() {
        Dp54 test=new Dp54();
        long time=0;
        for (int i = 0; i < 1 ; i++) {
            long start=System.currentTimeMillis();
            test.climbStairs(44);
            long end=System.currentTimeMillis();
            time+=end-start;
        }
        System.out.println(time/1);
    }
}