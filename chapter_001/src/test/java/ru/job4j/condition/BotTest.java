package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BotTest {
    @Test
    public void whenGreetBot() {
        Bot bot = new Bot();
        assertThat(bot.answer("Привет, Бот."),
                is("Привет, умник.")
        );
    }

    @Test
    public void whenByuBot() {
        Bot bot = new Bot();
        assertThat(bot.answer("Пока."),
                is("До скорой встречи.")
        );
    }

    @Test
    public void whenUnknownBot() {
        Bot bot = new Bot();
        assertThat(bot.answer("Сколько будет 2 + 2?"),
                is("Пусть калькулятор тебе посчитает!")
        );
    }
}