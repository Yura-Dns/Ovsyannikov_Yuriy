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
        FindMaxValueOfThree calc = new FindMaxValueOfThree();
        int maxOfTwo = calc.findMaxValueTwo(3,2);
        int maxOfThree = calc.findMaxValueThree(maxOfTwo, 34);
        int expected = 34;
        assertThat(maxOfThree, is(expected));
    }
}