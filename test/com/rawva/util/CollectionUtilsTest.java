package com.rawva.util;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CollectionUtilsTest {

	@Test
	public void testGetElementCounts() {
		Collection<String> elems = new ArrayList<>();
		Map<String, Integer> expectedElemCounts = new HashMap<>();

		assertEquals(expectedElemCounts, CollectionUtils.getElementCounts(elems));

		elems.add("A");
		expectedElemCounts.put("A", 1);
		assertEquals(expectedElemCounts, CollectionUtils.getElementCounts(elems));

		elems.add("B");
		elems.add("A");
		expectedElemCounts.put("A", 2);
		expectedElemCounts.put("B", 1);
		assertEquals(expectedElemCounts, CollectionUtils.getElementCounts(elems));
	}

	@Test
	public void testGetMostFrequentElement() {
		Collection<String> elems = new ArrayList<>();
		elems.add("A");

		assertEquals("A", CollectionUtils.getMostFrequentElement(elems));

		elems.add("B");
		assertEquals("A", CollectionUtils.getMostFrequentElement(elems));

		elems.add("B");
		assertEquals("B", CollectionUtils.getMostFrequentElement(elems));
	}

	@Test
	public void testGetLeastFrequentElement() {
		Collection<String> elems = new ArrayList<>();
		elems.add("A");

		assertEquals("A", CollectionUtils.getLeastFrequentElement(elems));

		elems.add("B");
		assertEquals("A", CollectionUtils.getLeastFrequentElement(elems));

		elems.add("B");
		assertEquals("A", CollectionUtils.getLeastFrequentElement(elems));
	}

}
