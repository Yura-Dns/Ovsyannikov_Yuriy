package ru.job4j.calculate;
/**
 * (Тест на определение максимального значения)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindMaxValueOfThreeTest {
    @Test
    public void maxValue() {
    FindMaxValueHost findMaxValueHost = new FindMaxValueHost();
        assertThat(findMaxValueHost.maxValue(2,5,9),
                is(9));
    }
}