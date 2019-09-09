package com.capgemini.samples;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private App app = new App();

    @Test
    public void testMinus() {
        assertThat(app.minus(2, 1)).isEqualTo(1);
    }
}
