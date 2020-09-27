package sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FailTest {

    @Test
    void failedTest(){
        Assertions.fail("failed manually");

        Assertions.assertTrue(true);
    }
}
