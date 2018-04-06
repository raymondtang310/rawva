package com.rawva.structures.graphs;

/**
 * A weighted graph is a type of graph in which weights are associated with
 * edges. An edge weight is an object that indicates some value associated with
 * an edge.
 * 
 * @author Raymond Tang
 *
 * @param <V>
 *            - the type of elements (vertices) in this graph
 * @param <W>
 *            - the type of edge weights in this graph
 */
public interface WeightedGraph<V, W> extends Graph<V> {

	/**
	 * Adds an edge with the specified weight from the specified tail element to
	 * the specified head element if the edge does not already exist. Returns
	 * true if the edge was added to this graph after this call. If the edge
	 * specified by the tail and head elements already exists, then false is
	 * returned.
	 * 
	 * In order to add an edge between two elements, it is required that the two
	 * elements have already been added to this graph. If the specified elements
	 * are not in this graph, then no edge is added and false is returned.
	 * 
	 * @param tail
	 *            the tail vertex
	 * @param head
	 *            the head vertex
	 * @param weight
	 *            the weight of the edge
	 * @return true if the edge was added to this graph, else false
	 * @throws ClassCastException
	 *             if the class of the specified elements prevent them from
	 *             being added to this graph
	 * @throws NullPointerException
	 *             if one or both of the specified elements are null and this
	 *             graph does not permit null elements
	 * @throws IllegalArgumentException
	 *             if some property of one or both of the elements prevents them
	 *             from being added to this graph
	 * @throws IllegalStateException
	 *             if the elements cannot be added at this time due to insertion
	 *             restrictions
	 */
	public boolean addEdge(V tail, V head, W weight);

	/**
	 * Returns the weight of the edge from tail to head if the edge exists and
	 * has an associated weight, or null otherwise.
	 * 
	 * @param tail
	 *            the tail vertex
	 * @param head
	 *            the head vertex
	 * @return the weight of the edge from tail to head
	 */
	public W getWeight(V tail, V head);

	/**
	 * Sets the weight of the edge from tail to head to the specified weight.
	 * Returns true if the weight of the edge is set successfully. Returns false
	 * otherwise.
	 * 
	 * If the specified elements are not in this graph or if an edge from tail
	 * to head does not exist, then false is returned.
	 * 
	 * @param tail
	 *            the tail vertex
	 * @param head
	 *            the head vertex
	 * @param weight
	 *            the weight of the edge to set
	 * @return
	 */
	public boolean setWeight(V tail, V head, W weight);

}
