package com.rawva.structures.graphs;

/**
 * An edge is a pair of objects (o1, o2), signifying some association between o1
 * and o2. o1 is called the tail of the edge, and o2 is called the head.
 * 
 * @author Raymond Tang
 *
 * @param <V>
 *            - the type of elements in this edge
 */
interface Edge<V> {

	/**
	 * Returns the tail of this edge.
	 * 
	 * @return the tail of this edge
	 */
	V getTail();

	/**
	 * Returns the head of this edge.
	 * 
	 * @return the head of this edge
	 */
	V getHead();

}