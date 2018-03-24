package ru.job4j.calculate;
/**
 * M_V_Test (Maximum_value_Test - Тест на определение максимального значения)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class M_V_Test {
    @Test
    public void maxValue() {
        M_V calc = new M_V();
        int result = calc.max(1, 3);
        int expected = 3;
        assertThat(result, is(expected));
    }
}