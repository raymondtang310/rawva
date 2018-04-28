package com.rawva.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * This class provides various operations on strings.
 * 
 * @author Raymond Tang
 *
 */
public class StringUtils {

	/**
	 * Converts the first letter of the specified string to uppercase. If the
	 * specified string is empty, then the empty string is returned. If the
	 * first letter of the specified string is already capitalized, then the
	 * specified string is returned as is.
	 * 
	 * @param s
	 *            the string to capitalize
	 * @return a copy of the specified string with the first letter converted to
	 *         uppercase, or the empty string if the specified string is empty
	 * @throws NullPointerException
	 *             if the specified string is null
	 */
	public static String capitalize(String s) {
		if (s == null) {
			throw new NullPointerException("Input string should not be null");
		}
		if (s.isEmpty()) {
			return "";
		}
		return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}

	/**
	 * Computes all permutations of the specified string and returns them in a
	 * set. If the specified string is null, then an empty set is returned. If
	 * the specified string is empty, then a set containing the empty string is
	 * returned.
	 * 
	 * @param s
	 *            the string to permute
	 * @return a set containing all permutations of the specified string
	 */
	public static Set<String> permute(String s) {
		Set<String> permutations = new HashSet<>();
		if (s == null) {
			return permutations;
		}
		collectPermutations(permutations, "", s);
		return permutations;
	}

	/**
	 * Computes all permutations of the specified string toPermute.
	 * 
	 * @param permutations
	 *            a set to store all computed permutations of the specified
	 *            string
	 * @param prefix
	 *            a string containing the characters of the current permutation
	 *            in progress
	 * @param toPermute
	 *            the string to permute
	 */
	private static void collectPermutations(Set<String> permutations, String prefix, String toPermute) {
		if (toPermute.isEmpty()) {
			permutations.add(prefix);
			return;
		}
		for (int i = 0; i < toPermute.length(); i++) {
			collectPermutations(permutations, prefix + toPermute.charAt(i),
					toPermute.substring(0, i) + toPermute.substring(i + 1));
		}
	}

	/**
	 * Sorts the specified string by its characters in lexicographical order.
	 * <br/>
	 * <br/>
	 * Examples: <br/>
	 * <br/>
	 * "cba" -> "abc" <br/>
	 * "21354" -> "12345"
	 * 
	 * @param s
	 *            the string to sort
	 * @return the sorted string
	 * @throws NullPointerException
	 *             if the specified string is null
	 */
	public static String sort(String s) {
		if (s == null) {
			throw new NullPointerException("Input string should not be null");
		}
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}

}
