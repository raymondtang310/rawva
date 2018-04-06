package com.rawva.structures.graphs;

/**
 * A directed edge is an ordered pair of objects (o1, o2).
 * 
 * @author Raymond Tang
 *
 * @param <V>
 *            - the type of elements in this edge
 */
class DirectedEdge<V> implements Edge<V> {

	private final V tail;
	private final V head;

	DirectedEdge(V tail, V head) {
		this.tail = tail;
		this.head = head;
	}

	@Override
	public V getTail() {
		return tail;
	}

	@Override
	public V getHead() {
		return head;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((head == null) ? 0 : head.hashCode());
		result = prime * result + ((tail == null) ? 0 : tail.hashCode());
		return result;
	}

	/**
	 * Checks if the specified object is equal to this. Two undirected edges
	 * (o1, o2) and (o3, o4) are considered equal if and only if o1 and o3 are
	 * equal and o2 and o4 are equal.
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
		if (!(obj instanceof DirectedEdge)) {
			return false;
		}
		@SuppressWarnings("unchecked")
		DirectedEdge<V> other = (DirectedEdge<V>) obj;
		if (equals(tail, other.tail) && equals(head, other.head)) {
			return true;
		}
		return false;
	}

	private boolean equals(V e1, V e2) {
		return (e1 == null && e2 == null) || (e1 != null && e1.equals(e2));
	}

}
