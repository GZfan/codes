import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array24Test {

    @Test
    void containsDuplicate() {
        Array24 test=new Array24();
        int[] arr={1,5,-2,-4,0};
        test.containsDuplicate(arr);
    }
}