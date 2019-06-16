import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Others120Test {

    @Test
    void evalRPN() {
        Others120 test=new Others120();
        String[] tem=new String[]{"1","2","+","3","*"};
        test.evalRPN(tem);
    }
}