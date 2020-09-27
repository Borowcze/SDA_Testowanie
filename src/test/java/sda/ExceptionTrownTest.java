package sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTrownTest {

    @Test
//    void myException(){
//        Assertions.assertThrows(MyException(), () -> {
//           throwException();
//        });
//    }
    private static void throwException() throws MyException{
        throw new MyException();
    }
    private static class MyException extends Exception{}
}
