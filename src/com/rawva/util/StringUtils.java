package com.rawva.util;

import java.util.Arrays;

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
