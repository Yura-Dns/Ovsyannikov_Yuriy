package ru.job4j.convectr_valyut;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvectrTest {
    @Test
    public void when60RubleToEuroThen1() {
        Convectr convectr = new Convectr();
        int result = convectr.rubleToEuro(70);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToDollarThen1() {
        Convectr convectr = new Convectr();
        int result = convectr.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when1DollarToRubleThen60() {
        Convectr convectr = new Convectr();
        int result = convectr.dollarToruble(1);
        assertThat(result, is(60));
    }

    @Test
    public void when1EuroToRubleThen70() {
        Convectr convectr = new Convectr();
        int result = convectr.euroToRuble(1);
        assertThat(result, is(70));
    }
}