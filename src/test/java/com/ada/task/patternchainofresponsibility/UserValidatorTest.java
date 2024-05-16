package com.ada.task.patternchainofresponsibility;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    @Test
    void testValidUser() {
        User user = new User("Marek", "Mostowiak", "12345678910", "john@example.com", "123456789");
        UserValidatorChain validatorChain = new UserValidatorChain();
        assertTrue(validatorChain.validate(user));
    }

    @Test
    void testInvalidUser() {
        User user = new User("Marek", "Mostowiak", "12345678910", "johnexample.com", "pass");
        UserValidatorChain validatorChain = new UserValidatorChain();
        assertFalse(validatorChain.validate(user));
    }
}