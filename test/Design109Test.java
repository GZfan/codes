import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Design109Test {

    @Test
    void serialize() {
        Design109 test=new Design109();
        test.serialize(test.deserialize("[1,2,3,null,null,4,5]"));
        return;
    }


}