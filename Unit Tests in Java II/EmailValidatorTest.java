package com.vogella.unittest.email;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmailValidatorTest {
    @Test
    public void test1() {
        assertTrue(EmailValidator.isValidEmail("dels.delsa@gmail.com"));
    }

    @Test
    public void test2() {
        assertTrue(EmailValidator.isValidEmail("tra@sub.ndsan.com"));
    }

    @Test
    @DisplayName("Ensure that a missing top level domain returns false")
    public void test3() {
        assertFalse(EmailValidator.isValidEmail("well@subkdile"));
    }

    @Test
    public void test4() {
        assertFalse(EmailValidator.isValidEmail("deus@dlsrt..com"));
    }

    @Test
    public void test5() {
        assertFalse(EmailValidator.isValidEmail("@lksrs.com"));
    }

    @Test
    public void test6() {
        assertFalse(EmailValidator.isValidEmail(""));
    }

    @Test
    public void test7() {
        assertFalse(EmailValidator.isValidEmail(null));
    }
}
