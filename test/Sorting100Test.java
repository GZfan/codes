import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sorting100Test {

    @Test
    void searchRange() {
        Sorting100 test=new Sorting100();
        test.searchRange(new int[]{5,7,7,8,8,10}, 8);
    }
}