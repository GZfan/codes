import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Design59Test {

    @Test
    void push() {
        Design59 test=new Design59();
        test.push(-2);
        test.push(0);
        test.push(-3);
        System.out.println(test.getMin());
        test.pop();
        test.top();
        System.out.println(test.getMin());
    }

    @Test
    void pop() {
    }

    @Test
    void top() {
    }

    @Test
    void getMin() {
    }
}