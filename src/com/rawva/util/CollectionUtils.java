package com.rawva.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * This class provides various operations on collections.
 * 
 * @author Raymond Tang
 *
 */
public class CollectionUtils {

	/**
	 * Returns a map containing the frequency of each element in the specified
	 * collection. If the specified collection is empty, then an empty map is
	 * returned.
	 * 
	 * @param elems
	 *            the collection in which to find the element counts
	 * @return a map containing the frequency of each element in the specified
	 *         collection
	 * @throws NullPointerException
	 *             if the specified collection is null
	 */
	public static <E> Map<E, Integer> getElementCounts(Collection<E> elems) {
		if (elems == null) {
			throw new NullPointerException("Input collection cannot be null");
		}

		return getElementCountsMap(elems);
	}

	/**
	 * Returns a map containing the frequency of each element in the specified
	 * collection. If the specified collection is empty, then an empty map is
	 * returned.
	 * 
	 * @param elems
	 *            the collection in which to find the element counts
	 * @return a map containing the frequency of each element in the specified
	 *         collection
	 */
	private static <E> Map<E, Integer> getElementCountsMap(Collection<E> elems) {
		Map<E, Integer> elemCounts = new HashMap<>();
		for (E elem : elems) {
			int count = elemCounts.getOrDefault(elem, 0);
			elemCounts.put(elem, count + 1);
		}

		return elemCounts;
	}

	/**
	 * Returns the element that occurs the most frequently in the specified
	 * collection. If there is a tie, the most frequent element that appears
	 * earliest when iterating over the collection is returned. <br/>
	 * <br/>
	 * Examples:<br/>
	 * <br/>
	 * ["hi", "hello", "hello"] -> "hello" <br/>
	 * [1, 2, 1] -> 1 <br/>
	 * ['a', 'b', 'c'] -> 'a' <br/>
	 * 
	 * @param elems
	 *            the collection in which to find the most frequent element
	 * @return the element that occurs the most frequently in the specified
	 *         collection
	 * @throws NullPointerException
	 *             if the specified collection is null
	 * @throws IllegalArgumentException
	 *             if the specified collection is empty
	 */
	public static <E> E getMostFrequentElement(Collection<E> elems) {
		if (elems == null) {
			throw new NullPointerException("Input collection cannot be null");
		}

		if (elems.isEmpty()) {
			throw new IllegalArgumentException("Input collection cannot be empty");
		}

		Map<E, Integer> elemCounts = getElementCountsMap(elems);
		E maxElem = null;
		for (E elem : elemCounts.keySet()) {
			if (elemCounts.get(elem) > elemCounts.getOrDefault(maxElem, 0)) {
				maxElem = elem;
			}
		}

		return maxElem;
	}

	/**
	 * Returns the element that occurs the least frequently in the specified
	 * collection. If there is a tie, the least frequent element that appears
	 * earliest when iterating over the collection is returned. <br/>
	 * <br/>
	 * Examples:<br/>
	 * <br/>
	 * ["hi", "hello", "hello"] -> "hi" <br/>
	 * [1, 2, 1] -> 2 <br/>
	 * ['a', 'b', 'c'] -> 'a' <br/>
	 * 
	 * @param elems
	 *            the collection in which to find the least frequent element
	 * @return the element that occurs the least frequently in the specified
	 *         collection
	 * @throws NullPointerException
	 *             if the specified collection is null
	 * @throws IllegalArgumentException
	 *             if the specified collection is empty
	 */
	public static <E> E getLeastFrequentElement(Collection<E> elems) {
		if (elems == null) {
			throw new NullPointerException("Input collection cannot be null");
		}

		if (elems.isEmpty()) {
			throw new IllegalArgumentException("Input collection cannot be empty");
		}

		Map<E, Integer> elemCounts = getElementCountsMap(elems);
		E minElem = null;
		for (E elem : elemCounts.keySet()) {
			if (elemCounts.get(elem) < elemCounts.getOrDefault(minElem, 2)) {
				minElem = elem;
			}
		}

		return minElem;
	}

}
