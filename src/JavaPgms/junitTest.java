package JavaPgms;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class junitTest {

	@Test
	public static void myFirstTest(){
		int a = 10;
		int b = 10;
		int result = a + b;
		assertEquals(10, result);
	}
}
