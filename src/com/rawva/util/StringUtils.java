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
	 * Returns a copy of the specified string with the first letter converted to
	 * uppercase. If the specified string is empty, then the empty string is
	 * returned.
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
	 * Returns a copy of the specified string with the characters in sorted
	 * order. <br/>
	 * <br/>
	 * Examples: <br/>
	 * <br/>
	 * "cba" -> "abc" <br/>
	 * "21354" -> "12345"
	 * 
	 * @param s
	 *            the string to sort
	 * @return a copy of the specified string with the characters in sorted
	 *         order
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
