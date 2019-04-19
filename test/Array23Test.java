import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array23Test {

    @Test
    void rotate() {
        int[] t={1,2,3,4,5,6,7};
        Array23 temp=new Array23();
        temp.rotate(t,3);
    }
}