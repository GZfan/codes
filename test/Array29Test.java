import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array29Test {

    @Test
    void twoSum() {
        int[] nums={2,5,5,11};
        int[] answer={1,2};
        Array29 test=new Array29();
        Assertions.assertArrayEquals(answer,test.twoSum(nums, 10));
    }
}