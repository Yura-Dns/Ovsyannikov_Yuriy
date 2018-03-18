package ru.job4j.convectr_valyut;

/**
 * Корвертор валюты.
 */
public class Convectr {
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value/70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value/60;
    }

    /**
     * Конвертируем Доллары в рубли.
     * @param value доллары.
     * @return рубли
     */
    public int dollarToruble(int value) {
        return value*60;
    }

    /**
     * Конвертируем Евро в рубли.
     * @param value Евро.
     * @return рубли
     */
    public int euroToRuble(int value) {
        return value*70;
    }
}