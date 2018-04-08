package com.rawva.structures.graphs;

import java.util.HashSet;
import java.util.Set;

/**
 * An undirected edge is an unordered pair of objects (o1, o2). An undirected
 * edge (o1, o2) is considered equal to (o2, o1).
 * 
 * @author Raymond Tang
 *
 * @param <V>
 *            - the type of elements in this edge
 */
class UndirectedEdge<V> implements Edge<V> {

	private final V tail;
	private final V head;

	/**
	 * Constructs an undirected edge between the specified elements.
	 * 
	 * @param e1
	 *            - one of the vertices to be part of this edge
	 * @param e2
	 *            - the other vertex to be part of this edge
	 */
	UndirectedEdge(V e1, V e2) {
		this.tail = e1;
		this.head = e2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		Set<V> elements = new HashSet<>();
		elements.add(tail);
		elements.add(head);
		final int prime = 31;
		int result = 1;
		result = prime * result + ((elements == null) ? 0 : elements.hashCode());
		return result;
	}

	/**
	 * Checks if the specified object is equal to this. Two undirected edges
	 * (o1, o2) and (o3, o4) are considered equal if and only if 1) o1 and o3
	 * are equal, and o2 and o4 are equal or 2) o1 and o4 are equal, and o2 and
	 * o3 are equal.
	 * 
	 * @param obj
	 *            - the object to compare to this
	 * @return true if the specified object is equal to this, else false
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof UndirectedEdge)) {
			return false;
		}
		@SuppressWarnings("unchecked")
		UndirectedEdge<V> other = (UndirectedEdge<V>) obj;
		Set<V> elements = new HashSet<>();
		elements.add(tail);
		elements.add(head);
		Set<V> otherElements = new HashSet<>();
		otherElements.add(other.tail);
		otherElements.add(other.head);
		return elements.equals(otherElements);
	}

	/**
	 * Returns the tail of this edge. <br/>
	 * <br/>
	 * Note that for an undirected edge, (o1, o2) is the same as (o2, o1). We
	 * consider the tail of this edge to be the element that was input first
	 * during creation. <br/>
	 * <br/>
	 * Example: <br/>
	 * <br/>
	 * UndirectedEdge<Integer> edge = new UndirectedEdge<>(2, 1) <br/>
	 * edge.getTail() // 2 <br/>
	 * 
	 * @return the tail of this edge
	 */
	@Override
	public V getTail() {
		return tail;
	}

	/**
	 * Returns the head of this edge. <br/>
	 * <br/>
	 * Note that for an undirected edge, (o1, o2) is the same as (o2, o1). We
	 * consider the head of this edge to be the element that was input second
	 * during creation. <br/>
	 * <br/>
	 * Example: <br/>
	 * <br/>
	 * DirectedEdge<Integer> edge = new DirectedEdge<>(2, 1) <br/>
	 * edge.getHead() // 1 <br/>
	 * 
	 * @return the tail of this edge
	 */
	@Override
	public V getHead() {
		return head;
	}

}
