package com.rawva.structures.graphs;

/**
 * A directed edge is an ordered pair of objects (o1, o2).
 * 
 * @author Raymond Tang
 *
 * @param <V>
 *            the type of elements in this edge
 */
public class DirectedEdge<V> implements Graph.Edge<V> {

	private final V tail;
	private final V head;

	/**
	 * Constructs an edge from the specified tail element to the specified head
	 * element.
	 * 
	 * @param tail
	 *            the tail vertex
	 * @param head
	 *            the head vertex
	 */
	public DirectedEdge(V tail, V head) {
		this.tail = tail;
		this.head = head;
	}

	/**
	 * Returns the tail of this edge.
	 * 
	 * @return the tail of this edge
	 */
	@Override
	public V getTail() {
		return tail;
	}

	/**
	 * Returns the head of this edge.
	 * 
	 * @return the head of this edge
	 */
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
	 *            the object to compare to this
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

	/**
	 * Returns true if the specified elements are equal. More formally, true is
	 * returned if e1 == e2 or e1.equals(e2). <br/>
	 * <br/>
	 * The main advantage of calling this method over calling the equals method
	 * on one of the elements is that e1 and e2 are both allowed to be null. For
	 * example, in the case that e1 is null, calling e1.equals(e2) throws a
	 * NullPointerException whereas calling equals(e1, e2) does not.
	 * 
	 * @param e1
	 *            one of the elements to be compared
	 * @param e2
	 *            the other element to be compared
	 * @return true if the specified elements are equal, else false
	 */
	private boolean equals(V e1, V e2) {
		return (e1 == e2) || (e1 != null && e1.equals(e2));
	}

}
