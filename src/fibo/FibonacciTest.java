package fibo;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * The Class FibonacciTest.
 */
public class FibonacciTest {

	/**
	 * Test generate series count.
	 */
	@Test
	public void testGenerateSeriesCount() {
		int arrayCount = 10;
		int[] series = Fibonacci.generateSeries(arrayCount);
		assertTrue(series.length == arrayCount);
	}

	/**
	 * Test generate series min value.
	 */
	@Test
	public void testGenerateSeriesMinValue() {
		int arrayCount = 1;
		int[] series = Fibonacci.generateSeries(arrayCount);
		assertTrue(series[0] == 0);
	}

	/**
	 * Test generate series values.
	 */
	@Test
	public void testGenerateSeriesValues() {
		int arrayCount = 10;
		int[] series = Fibonacci.generateSeries(arrayCount);
		assertTrue(series[0] == 0);
		assertTrue(series[1] == 1);
		assertTrue(series[2] == 1);
		assertTrue(series[3] == 2);
	}

	/**
	 * Test generate series max value.
	 */
	@Test
	public void testGenerateSeriesMaxValue() {
		int arrayCount = 10;
		int[] series = Fibonacci.generateSeries(arrayCount);
		assertTrue(series[9] == 34);
	}

	/**
	 * Test generate series limit.
	 */
	@Test
	public void testGenerateSeriesLimit() {
		int arrayCount = 48;
		int[] series = Fibonacci.generateSeries(arrayCount);
		assertTrue(series[46] > 0);

	}
}
