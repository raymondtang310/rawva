package com.rawva.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This class provides various operations on strings.
 * 
 * @author Raymond Tang
 *
 */
public class StringUtils {

	/**
	 * Converts the first letter of the specified string to upper case. If the
	 * specified string is empty, then the empty string is returned. If the
	 * first letter of the specified string is already capitalized, then the
	 * specified string is returned as is.
	 * 
	 * @param s
	 *            the string to capitalize
	 * @return a copy of the specified string with the first letter converted to
	 *         upper case, or the empty string if the specified string is empty
	 * @throws NullPointerException
	 *             if the specified string is null
	 */
	public static String capitalize(String s) {
		if (s == null) {
			throw new NullPointerException("Input string cannot be null");
		}
		if (s.isEmpty()) {
			return "";
		}
		return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}

	/**
	 * Returns the character that occurs the most frequently in the specified
	 * string. If there is a tie, the most frequent character that appears
	 * earliest in the string is returned. <br/>
	 * <br/>
	 * Examples:<br/>
	 * <br/>
	 * "abb" -> 'b' <br/>
	 * "$def$" -> '$' <br/>
	 * "abc" -> 'a' <br/>
	 * 
	 * @param s
	 *            the string in which to find the most frequent character
	 * @return the character that occurs the most frequently in the specified
	 *         string
	 */
	public static char getMostFrequentCharacter(String s) {
		if (s == null) {
			throw new NullPointerException("Input string cannot be null");
		}
		if (s.isEmpty()) {
			throw new IllegalArgumentException("Input string cannot be empty");
		}
		// Find the count of each character in the string
		Map<Character, Integer> counts = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!counts.containsKey(c)) {
				counts.put(c, 1);
			} else {
				int count = counts.get(c);
				counts.put(c, count + 1);
			}
		}
		// Find the character with the highest count
		char maxChar = s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			if (counts.get(c) > counts.get(maxChar)) {
				maxChar = c;
			}
		}
		return maxChar;
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
			throw new NullPointerException("Input string cannot be null");
		}
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}

}
