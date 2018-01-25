package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class CalculateTest {
	/**
	 * Test echo.
	 */
	@Test
	public void whenTakeNameThenTreeEchoPlusName() {
		String input = "Alexander Sergeev";
		String expect = "Echo, echo, echo : Alexander Sergeev";
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}

}