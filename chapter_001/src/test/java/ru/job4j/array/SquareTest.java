package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *bond - количество ячеик которых необходимо создать в массиве
 *ind - индекс ячейки которую нужно тестировать
 *В данном тесте было создано 3 ячейки. Вызван 2 индекс массива,
 * который должен ровняться 2 возведённый в квадрат, то есть 4,
 * соответсвенно ожидать должны именно 4.
 * Массив заполняется - : (0, 1, 2, 3 ..., bond-1)
 */
public class SquareTest {
    @Test
    public void form() {
        Square calc = new Square();
        calc.form(3, 2);
        double result = calc.oRes();
        double expected = 4;
        assertThat(result, is(expected));
    }
}