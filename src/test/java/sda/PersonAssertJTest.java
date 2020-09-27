package sda;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonAssertJTest {

    @Test
    void personTest(){
        //arrange
        final var jan = new PersonTest.Person("Jan", "Kowalski");
        // act
        final var fullName = jan.getFullName();
        // assert
        Assertions.assertThat(fullName)
                .as("Jan should be at start of string")
                .startsWith("Jan")
                .contains(" ")
                .endsWith("Kowalski");
    }
}
