import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Trees90Test {

    @Test
    void numIslands() {
        Trees90 test=new Trees90();
        char[][] t={{'1','1','1'},{'0','1','0'},{'1','1','1'}};
        test.numIslands(t);
    }
}