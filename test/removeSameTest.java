import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class removeSameTest {

    @Test
    void removeDuplicates() {
            removeSame t=new removeSame();
            int[] a={1,1,2};
            t.removeDuplicates(a);
    }
}