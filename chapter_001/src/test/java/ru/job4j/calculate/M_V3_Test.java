package ru.job4j.calculate;
/**
 * M_V_Test (Maximum_value_Test - Тест на определение максимального значения)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class M_V3_Test {
    @Test
    public void maxValue() {
        M_V3 calc = new M_V3();
        int result = calc.max(11, 3, 9);
        int expected = 11;
        assertThat(result, is(expected));
    }
}