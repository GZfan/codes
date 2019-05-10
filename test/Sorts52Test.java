import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sorts52Test {

    @Test
    void merge() {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        Sorts52 temp=new Sorts52();
        temp.merge(nums1,3,nums2,3);
    }
}