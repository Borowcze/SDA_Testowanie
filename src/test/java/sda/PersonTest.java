package sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonTest {

        @Test
        @DisplayName("Full name should be name + space + last name")
        void checkFullNameTest() {
            //arrange
            final var jan = new Person("Jan", "Kowalski");
            // act
            final var fullName = jan.getFullName();
            Assertions.assertAll(
                    () -> Assertions.assertTrue(fullName.startsWith("Jan"),
                        "Jan should be at start of string"),
                    () -> Assertions.assertTrue(fullName.contains(" "),
                    "Whitespace should be in the middle of name and last name"),
                    () -> Assertions.assertTrue(fullName.endsWith("Kowalski")));
        }
    static class Person {

        String name;
        String lastName;

        public Person(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        String getFullName() {
            return name + " " + lastName;
        }
    }


}