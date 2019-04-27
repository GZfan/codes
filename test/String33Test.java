import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class String33Test {

    @Test
    void reverse() {
        String33 test=new String33();
        test.reverse(-2147483648);
    }
}