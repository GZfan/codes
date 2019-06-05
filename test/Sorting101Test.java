import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sorting101Test {

    @Test
    void merge() {
        int[][] nums={{1,4},{4,5}};
        Sorting101 test=new Sorting101();
        test.merge(nums);
    }
}