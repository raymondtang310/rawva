package com.rawva.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testCapitalize() {
		assertEquals("", StringUtils.capitalize(""));
		assertEquals("String", StringUtils.capitalize("String"));
		assertEquals("String", StringUtils.capitalize("string"));
	}

	@Test
	public void testGetMostFrequentCharacter() {
		assertEquals('b', StringUtils.getMostFrequentCharacter("abb"));
		assertEquals('a', StringUtils.getMostFrequentCharacter("abc"));
		assertEquals('1', StringUtils.getMostFrequentCharacter("112233"));
		assertEquals('*', StringUtils.getMostFrequentCharacter("*def*"));
		assertEquals('$', StringUtils.getMostFrequentCharacter("$def$gg$gz$"));
	}

	@Test
	public void testPermute() {
		assertTrue(StringUtils.permute(null).isEmpty());

		Set<String> permutations = new HashSet<>();
		permutations.add("");
		assertEquals(permutations, StringUtils.permute(""));

		permutations.clear();
		permutations.add("a");
		assertEquals(permutations, StringUtils.permute("a"));

		permutations.clear();
		permutations.add("abc");
		permutations.add("acb");
		permutations.add("bac");
		permutations.add("bca");
		permutations.add("cab");
		permutations.add("cba");
		assertEquals(permutations, StringUtils.permute("abc"));
	}

	@Test
	public void testSort() {
		assertEquals("", StringUtils.sort(""));
		assertEquals("abcde", StringUtils.sort("abcde"));
		assertEquals("abcde", StringUtils.sort("ecadb"));
	}

}
