package ru.job4j.calculate;
/**
 * M_V_Test (Maximum_value_Test - Тест на определение максимального значения)
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class M_V_Test {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        M_V calc = new M_V();
        calc.add(1, 4);
        int result = calc.max();
        int expected = 4;
        assertThat(result, is(expected));
    }
}