package com.rawva.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testCapitalize() {
		assertEquals("", StringUtils.capitalize(""));
		assertEquals("String", StringUtils.capitalize("String"));
		assertEquals("String", StringUtils.capitalize("string"));
	}

	@Test
	public void testSort() {
		assertEquals("", StringUtils.sort(""));
		assertEquals("abcde", StringUtils.sort("abcde"));
		assertEquals("abcde", StringUtils.sort("ecadb"));
	}

}
