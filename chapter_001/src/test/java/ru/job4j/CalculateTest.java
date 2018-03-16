package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
* @author Yuriy Ovsyannikov (yura013013@mail.ru).
* @version $Id$.
* @since 0.1.
*/
public class CalculateTest {
	
/**
* Test echo.
* @Test.
*/
@Test
public void whenTakeNameThenTreeEchoPlusName() {
    String input = "yura_dns1";
    String expect = "Echo, echo, echo : yura_dns1";
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
	}
}
 