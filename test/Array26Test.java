import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array26Test {

    @Test
    void intersect() {
        Array26 temp=new Array26();
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] answer= temp.intersect(nums1,nums2);
    }
}