package org.example.springactiondemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SuccessTest {

    @Test
    public void must_success() {
        Assertions.assertTrue(true);
    }

    @Test
    void must_fail() {
        Assertions.assertTrue(false);
    }
}
