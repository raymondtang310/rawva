package com.rawva.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This class provides various operations on arrays.
 * 
 * @author Raymond Tang
 *
 */
public class ArrayUtils {

	/**
	 * Computes all permutations of the specified array and returns them as a
	 * set of lists. If the specified array is null, then an empty set is
	 * returned. If the specified array is empty, then a set containing an empty
	 * list is returned.
	 * 
	 * @param arr
	 *            the array to permute
	 * @return a set of lists containing all permutations of the specified array
	 */
	public static Set<List<Byte>> permute(byte... arr) {
		Set<List<Byte>> permutations = new HashSet<>();
		if (arr == null) {
			return permutations;
		}
		collectPermutations(arr, 0, new ArrayList<>(), permutations);
		return permutations;
	}

	/**
	 * Computes all permutations of the specified array.
	 * 
	 * @param arr
	 *            the array to permute
	 * @param start
	 *            the index of the element of the array to add to the current
	 *            permutation in progress
	 * @param permutation
	 *            a list containing the elements of the current permutation in
	 *            progress
	 * @param permutations
	 *            a set to store all computed permutations of the specified
	 *            array
	 */
	private static void collectPermutations(byte[] arr, int start, List<Byte> permutation,
			Set<List<Byte>> permutations) {
		if (permutation.size() == arr.length) {
			permutations.add(permutation);
			return;
		}

		for (int i = 0; i <= permutation.size(); i++) {
			List<Byte> newPermutation = new ArrayList<>(permutation);
			newPermutation.add(i, arr[start]);
			collectPermutations(arr, start + 1, newPermutation, permutations);
		}
	}

	/**
	 * Computes all permutations of the specified array and returns them as a
	 * set of lists. If the specified array is null, then an empty set is
	 * returned. If the specified array is empty, then a set containing an empty
	 * list is returned.
	 * 
	 * @param arr
	 *            the array to permute
	 * @return a set of lists containing all permutations of the specified array
	 */
	public static Set<List<Character>> permute(char... arr) {
		Set<List<Character>> permutations = new HashSet<>();
		if (arr == null) {
			return permutations;
		}
		collectPermutations(arr, 0, new ArrayList<>(), permutations);
		return permutations;
	}

	/**
	 * Computes all permutations of the specified array.
	 * 
	 * @param arr
	 *            the array to permute
	 * @param start
	 *            the index of the element of the array to add to the current
	 *            permutation in progress
	 * @param permutation
	 *            a list containing the elements of the current permutation in
	 *            progress
	 * @param permutations
	 *            a set to store all computed permutations of the specified
	 *            array
	 */
	private static void collectPermutations(char[] arr, int start, List<Character> permutation,
			Set<List<Character>> permutations) {
		if (permutation.size() == arr.length) {
			permutations.add(permutation);
			return;
		}

		for (int i = 0; i <= permutation.size(); i++) {
			List<Character> newPermutation = new ArrayList<>(permutation);
			newPermutation.add(i, arr[start]);
			collectPermutations(arr, start + 1, newPermutation, permutations);
		}
	}

	/**
	 * Computes all permutations of the specified array and returns them as a
	 * set of lists. If the specified array is null, then an empty set is
	 * returned. If the specified array is empty, then a set containing an empty
	 * list is returned.
	 * 
	 * @param arr
	 *            the array to permute
	 * @return a set of lists containing all permutations of the specified array
	 */
	public static Set<List<Double>> permute(double... arr) {
		Set<List<Double>> permutations = new HashSet<>();
		if (arr == null) {
			return permutations;
		}
		collectPermutations(arr, 0, new ArrayList<>(), permutations);
		return permutations;
	}

	/**
	 * Computes all permutations of the specified array.
	 * 
	 * @param arr
	 *            the array to permute
	 * @param start
	 *            the index of the element of the array to add to the current
	 *            permutation in progress
	 * @param permutation
	 *            a list containing the elements of the current permutation in
	 *            progress
	 * @param permutations
	 *            a set to store all computed permutations of the specified
	 *            array
	 */
	private static void collectPermutations(double[] arr, int start, List<Double> permutation,
			Set<List<Double>> permutations) {
		if (permutation.size() == arr.length) {
			permutations.add(permutation);
			return;
		}

		for (int i = 0; i <= permutation.size(); i++) {
			List<Double> newPermutation = new ArrayList<>(permutation);
			newPermutation.add(i, arr[start]);
			collectPermutations(arr, start + 1, newPermutation, permutations);
		}
	}

	/**
	 * Computes all permutations of the specified array and returns them as a
	 * set of lists. If the specified array is null, then an empty set is
	 * returned. If the specified array is empty, then a set containing an empty
	 * list is returned.
	 * 
	 * @param arr
	 *            the array to permute
	 * @return a set of lists containing all permutations of the specified array
	 */
	public static Set<List<Float>> permute(float... arr) {
		Set<List<Float>> permutations = new HashSet<>();
		if (arr == null) {
			return permutations;
		}
		collectPermutations(arr, 0, new ArrayList<>(), permutations);
		return permutations;
	}

	/**
	 * Computes all permutations of the specified array.
	 * 
	 * @param arr
	 *            the array to permute
	 * @param start
	 *            the index of the element of the array to add to the current
	 *            permutation in progress
	 * @param permutation
	 *            a list containing the elements of the current permutation in
	 *            progress
	 * @param permutations
	 *            a set to store all computed permutations of the specified
	 *            array
	 */
	private static void collectPermutations(float[] arr, int start, List<Float> permutation,
			Set<List<Float>> permutations) {
		if (permutation.size() == arr.length) {
			permutations.add(permutation);
			return;
		}

		for (int i = 0; i <= permutation.size(); i++) {
			List<Float> newPermutation = new ArrayList<>(permutation);
			newPermutation.add(i, arr[start]);
			collectPermutations(arr, start + 1, newPermutation, permutations);
		}
	}

	/**
	 * Computes all permutations of the specified array and returns them as a
	 * set of lists. If the specified array is null, then an empty set is
	 * returned. If the specified array is empty, then a set containing an empty
	 * list is returned.
	 * 
	 * @param arr
	 *            the array to permute
	 * @return a set of lists containing all permutations of the specified array
	 */
	public static Set<List<Integer>> permute(int... arr) {
		Set<List<Integer>> permutations = new HashSet<>();
		if (arr == null) {
			return permutations;
		}
		collectPermutations(arr, 0, new ArrayList<>(), permutations);
		return permutations;
	}

	/**
	 * Computes all permutations of the specified array.
	 * 
	 * @param arr
	 *            the array to permute
	 * @param start
	 *            the index of the element of the array to add to the current
	 *            permutation in progress
	 * @param permutation
	 *            a list containing the elements of the current permutation in
	 *            progress
	 * @param permutations
	 *            a set to store all computed permutations of the specified
	 *            array
	 */
	private static void collectPermutations(int[] arr, int start, List<Integer> permutation,
			Set<List<Integer>> permutations) {
		if (permutation.size() == arr.length) {
			permutations.add(permutation);
			return;
		}

		for (int i = 0; i <= permutation.size(); i++) {
			List<Integer> newPermutation = new ArrayList<>(permutation);
			newPermutation.add(i, arr[start]);
			collectPermutations(arr, start + 1, newPermutation, permutations);
		}
	}

	/**
	 * Computes all permutations of the specified array and returns them as a
	 * set of lists. If the specified array is null, then an empty set is
	 * returned. If the specified array is empty, then a set containing an empty
	 * list is returned.
	 * 
	 * @param arr
	 *            the array to permute
	 * @return a set of lists containing all permutations of the specified array
	 */
	public static Set<List<Long>> permute(long... arr) {
		Set<List<Long>> permutations = new HashSet<>();
		if (arr == null) {
			return permutations;
		}
		collectPermutations(arr, 0, new ArrayList<>(), permutations);
		return permutations;
	}

	/**
	 * Computes all permutations of the specified array.
	 * 
	 * @param arr
	 *            the array to permute
	 * @param start
	 *            the index of the element of the array to add to the current
	 *            permutation in progress
	 * @param permutation
	 *            a list containing the elements of the current permutation in
	 *            progress
	 * @param permutations
	 *            a set to store all computed permutations of the specified
	 *            array
	 */
	private static void collectPermutations(long[] arr, int start, List<Long> permutation,
			Set<List<Long>> permutations) {
		if (permutation.size() == arr.length) {
			permutations.add(permutation);
			return;
		}

		for (int i = 0; i <= permutation.size(); i++) {
			List<Long> newPermutation = new ArrayList<>(permutation);
			newPermutation.add(i, arr[start]);
			collectPermutations(arr, start + 1, newPermutation, permutations);
		}
	}

	/**
	 * Computes all permutations of the specified array and returns them as a
	 * set of lists. If the specified array is null, then an empty set is
	 * returned. If the specified array is empty, then a set containing an empty
	 * list is returned.
	 * 
	 * @param arr
	 *            the array to permute
	 * @return a set of lists containing all permutations of the specified array
	 */
	public static Set<List<Short>> permute(short... arr) {
		Set<List<Short>> permutations = new HashSet<>();
		if (arr == null) {
			return permutations;
		}
		collectPermutations(arr, 0, new ArrayList<>(), permutations);
		return permutations;
	}

	/**
	 * Computes all permutations of the specified array.
	 * 
	 * @param arr
	 *            the array to permute
	 * @param start
	 *            the index of the element of the array to add to the current
	 *            permutation in progress
	 * @param permutation
	 *            a list containing the elements of the current permutation in
	 *            progress
	 * @param permutations
	 *            a set to store all computed permutations of the specified
	 *            array
	 */
	private static void collectPermutations(short[] arr, int start, List<Short> permutation,
			Set<List<Short>> permutations) {
		if (permutation.size() == arr.length) {
			permutations.add(permutation);
			return;
		}

		for (int i = 0; i <= permutation.size(); i++) {
			List<Short> newPermutation = new ArrayList<>(permutation);
			newPermutation.add(i, arr[start]);
			collectPermutations(arr, start + 1, newPermutation, permutations);
		}
	}

	/**
	 * Computes all permutations of the specified array and returns them as a
	 * set of lists. If the specified array is null, then an empty set is
	 * returned. If the specified array is empty, then a set containing an empty
	 * list is returned.
	 * 
	 * @param <T>
	 *            the type of each array element
	 * 
	 * @param arr
	 *            the array to permute
	 * @return a set of lists containing all permutations of the specified array
	 */
	public static <T> Set<List<T>> permute(T[] arr) {
		Set<List<T>> permutations = new HashSet<>();
		if (arr == null) {
			return permutations;
		}
		collectPermutations(arr, 0, new ArrayList<>(), permutations);
		return permutations;
	}

	/**
	 * Computes all permutations of the specified array.
	 * 
	 * @param <T>
	 *            the type of each array element
	 * 
	 * @param arr
	 *            the array to permute
	 * @param start
	 *            the index of the element of the array to add to the current
	 *            permutation in progress
	 * @param permutation
	 *            a list containing the elements of the current permutation in
	 *            progress
	 * @param permutations
	 *            a set to store all computed permutations of the specified
	 *            array
	 */
	private static <T> void collectPermutations(T[] arr, int start, List<T> permutation, Set<List<T>> permutations) {
		if (permutation.size() == arr.length) {
			permutations.add(permutation);
			return;
		}

		for (int i = 0; i <= permutation.size(); i++) {
			List<T> newPermutation = new ArrayList<>(permutation);
			newPermutation.add(i, arr[start]);
			collectPermutations(arr, start + 1, newPermutation, permutations);
		}
	}

}
