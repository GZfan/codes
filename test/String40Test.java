import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class String40Test {

    @Test
    void longestCommonPrefix() {
        String40 test=new String40();
        String[] t=new String[1];
        t[0]="";
        test.longestCommonPrefix(t);
    }
}