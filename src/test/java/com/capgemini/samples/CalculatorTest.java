package com.capgemini.samples;

import org.junit.Test;
import org.mockito.Mockito;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.when;

public class CalculatorTest {
    @Test
    public void testMinus(){
        App app = Mockito.mock(App.class);
        Calculator calculator = new Calculator(app);

        when(app.minus(Mockito.anyInt(), Mockito.anyInt())).thenReturn(3);

        int result = app.minus(1,2);
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void testMinusException(){
        App app = Mockito.mock(App.class);
        Calculator calculator = new Calculator(app);

        when(app.minus(Mockito.eq(1), Mockito.eq(2))).thenThrow(new IllegalArgumentException("Don't pass 1 and 2"));

        assertThatIllegalArgumentException().isThrownBy(() -> calculator.minus(1,2)).withMessage("Don't pass 1 and 2");

    }
}
