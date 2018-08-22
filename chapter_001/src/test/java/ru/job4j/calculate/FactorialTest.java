package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void fL() {
        Factorial factorial = new Factorial();
        assertThat(factorial.fL(5),
                is(120)
        );
    }
    @Test
    public void fL1() {
        Factorial factorial = new Factorial();
        assertThat(factorial.fL(0),
                is(1)
        );
    }
}