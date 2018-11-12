package com.rawva.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class ArrayUtilsTest {

	@Test
	public void testPermuteBytes() {
		byte[] arr = null;
		assertTrue(ArrayUtils.permute(arr).isEmpty());

		Set<List<Byte>> permutations = new HashSet<>();
		permutations.add(new ArrayList<>());
		assertEquals(permutations, ArrayUtils.permute(new byte[0]));

		permutations.clear();
		permutations.add(Arrays.asList((byte) 1));
		assertEquals(permutations, ArrayUtils.permute(new byte[] { 1 }));

		permutations.clear();
		permutations.add(Arrays.asList(new Byte[] { 1, 2, 3 }));
		permutations.add(Arrays.asList(new Byte[] { 1, 3, 2 }));
		permutations.add(Arrays.asList(new Byte[] { 2, 1, 3 }));
		permutations.add(Arrays.asList(new Byte[] { 2, 3, 1 }));
		permutations.add(Arrays.asList(new Byte[] { 3, 1, 2 }));
		permutations.add(Arrays.asList(new Byte[] { 3, 2, 1 }));
		assertEquals(permutations, ArrayUtils.permute(new byte[] { 1, 2, 3 }));
	}

	@Test
	public void testPermuteChars() {
		char[] arr = null;
		assertTrue(ArrayUtils.permute(arr).isEmpty());

		Set<List<Character>> permutations = new HashSet<>();
		permutations.add(new ArrayList<>());
		assertEquals(permutations, ArrayUtils.permute(new char[0]));

		permutations.clear();
		permutations.add(Arrays.asList('a'));
		assertEquals(permutations, ArrayUtils.permute(new char[] { 'a' }));

		permutations.clear();
		permutations.add(Arrays.asList('a', 'b', 'c'));
		permutations.add(Arrays.asList('a', 'c', 'b'));
		permutations.add(Arrays.asList('b', 'a', 'c'));
		permutations.add(Arrays.asList('b', 'c', 'a'));
		permutations.add(Arrays.asList('c', 'a', 'b'));
		permutations.add(Arrays.asList('c', 'b', 'a'));
		assertEquals(permutations, ArrayUtils.permute('a', 'b', 'c'));
	}

	@Test
	public void testPermuteDoubles() {
		double[] arr = null;
		assertTrue(ArrayUtils.permute(arr).isEmpty());

		Set<List<Double>> permutations = new HashSet<>();
		permutations.add(new ArrayList<>());
		assertEquals(permutations, ArrayUtils.permute(new double[0]));

		permutations.clear();
		permutations.add(Arrays.asList(1.0));
		assertEquals(permutations, ArrayUtils.permute(1.0));

		permutations.clear();
		permutations.add(Arrays.asList(1.0, 2.0, 3.0));
		permutations.add(Arrays.asList(1.0, 3.0, 2.0));
		permutations.add(Arrays.asList(2.0, 1.0, 3.0));
		permutations.add(Arrays.asList(2.0, 3.0, 1.0));
		permutations.add(Arrays.asList(3.0, 1.0, 2.0));
		permutations.add(Arrays.asList(3.0, 2.0, 1.0));
		assertEquals(permutations, ArrayUtils.permute(1.0, 2.0, 3.0));
	}

	@Test
	public void testPermuteFloats() {
		float[] arr = null;
		assertTrue(ArrayUtils.permute(arr).isEmpty());

		Set<List<Float>> permutations = new HashSet<>();
		permutations.add(new ArrayList<>());
		assertEquals(permutations, ArrayUtils.permute(new float[0]));

		permutations.clear();
		permutations.add(Arrays.asList(1f));
		assertEquals(permutations, ArrayUtils.permute(1f));

		permutations.clear();
		permutations.add(Arrays.asList(1f, 2f, 3f));
		permutations.add(Arrays.asList(1f, 3f, 2f));
		permutations.add(Arrays.asList(2f, 1f, 3f));
		permutations.add(Arrays.asList(2f, 3f, 1f));
		permutations.add(Arrays.asList(3f, 1f, 2f));
		permutations.add(Arrays.asList(3f, 2f, 1f));
		assertEquals(permutations, ArrayUtils.permute(1f, 2f, 3f));
	}

	@Test
	public void testPermuteInts() {
		int[] arr = null;
		assertTrue(ArrayUtils.permute(arr).isEmpty());

		Set<List<Integer>> permutations = new HashSet<>();
		permutations.add(new ArrayList<>());
		assertEquals(permutations, ArrayUtils.permute(new int[0]));

		permutations.clear();
		permutations.add(Arrays.asList(1));
		assertEquals(permutations, ArrayUtils.permute(1));

		permutations.clear();
		permutations.add(Arrays.asList(1, 2, 3));
		permutations.add(Arrays.asList(1, 3, 2));
		permutations.add(Arrays.asList(2, 1, 3));
		permutations.add(Arrays.asList(2, 3, 1));
		permutations.add(Arrays.asList(3, 1, 2));
		permutations.add(Arrays.asList(3, 2, 1));
		assertEquals(permutations, ArrayUtils.permute(1, 2, 3));
	}

	@Test
	public void testPermuteLongs() {
		long[] arr = null;
		assertTrue(ArrayUtils.permute(arr).isEmpty());

		Set<List<Long>> permutations = new HashSet<>();
		permutations.add(new ArrayList<>());
		assertEquals(permutations, ArrayUtils.permute(new long[0]));

		permutations.clear();
		permutations.add(Arrays.asList(1L));
		assertEquals(permutations, ArrayUtils.permute(1L));

		permutations.clear();
		permutations.add(Arrays.asList(1L, 2L, 3L));
		permutations.add(Arrays.asList(1L, 3L, 2L));
		permutations.add(Arrays.asList(2L, 1L, 3L));
		permutations.add(Arrays.asList(2L, 3L, 1L));
		permutations.add(Arrays.asList(3L, 1L, 2L));
		permutations.add(Arrays.asList(3L, 2L, 1L));
		assertEquals(permutations, ArrayUtils.permute(1L, 2L, 3L));
	}

	@Test
	public void testPermuteShorts() {
		short[] arr = null;
		assertTrue(ArrayUtils.permute(arr).isEmpty());

		Set<List<Short>> permutations = new HashSet<>();
		permutations.add(new ArrayList<>());
		assertEquals(permutations, ArrayUtils.permute(new short[0]));

		permutations.clear();
		permutations.add(Arrays.asList((short) 1));
		assertEquals(permutations, ArrayUtils.permute(new short[] { 1 }));

		permutations.clear();
		permutations.add(Arrays.asList(new Short[] { 1, 2, 3 }));
		permutations.add(Arrays.asList(new Short[] { 1, 3, 2 }));
		permutations.add(Arrays.asList(new Short[] { 2, 1, 3 }));
		permutations.add(Arrays.asList(new Short[] { 2, 3, 1 }));
		permutations.add(Arrays.asList(new Short[] { 3, 1, 2 }));
		permutations.add(Arrays.asList(new Short[] { 3, 2, 1 }));
		assertEquals(permutations, ArrayUtils.permute(new short[] { 1, 2, 3 }));
	}

	@Test
	public void testPermuteObjects() {
		String[] arr = null;
		assertTrue(ArrayUtils.permute(arr).isEmpty());

		Set<List<String>> permutations = new HashSet<>();
		permutations.add(new ArrayList<>());
		assertEquals(permutations, ArrayUtils.permute(new String[0]));

		permutations.clear();
		permutations.add(Arrays.asList("1"));
		assertEquals(permutations, ArrayUtils.permute(new String[] { "1" }));

		permutations.clear();
		permutations.add(Arrays.asList("1", "2", "3"));
		permutations.add(Arrays.asList("1", "3", "2"));
		permutations.add(Arrays.asList("2", "1", "3"));
		permutations.add(Arrays.asList("2", "3", "1"));
		permutations.add(Arrays.asList("3", "1", "2"));
		permutations.add(Arrays.asList("3", "2", "1"));
		assertEquals(permutations, ArrayUtils.permute(new String[] { "1", "2", "3" }));
	}

}
