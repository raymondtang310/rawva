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
	 * the specified head element. Returns true if the edge was successfully
	 * added to this graph after this call.
	 * 
	 * @param tail
	 *            - the tail vertex
	 * @param head
	 *            - the head vertex
	 * @param weight
	 *            - the weight of the edge
	 * @return true if the edge was added to this graph after this call, else
	 *         false
	 * @throws NullPointerException
	 *             if one or more of the arguments are null and this graph does
	 *             not permit null values
	 * @throws IllegalArgumentException
	 *             if some property of one or more of the arguments prevents the
	 *             edge from being added to this graph
	 * @throws IllegalStateException
	 *             if the edge cannot be added at this time due to insertion
	 *             restrictions
	 */
	public boolean addEdge(V tail, V head, W weight);

	/**
	 * Returns the weight of the edge from tail to head if the edge exists and
	 * has an associated weight, or null otherwise. A null return may also
	 * indicate that the weight of the edge was set to null, if the
	 * implementation supports null values.
	 * 
	 * @param tail
	 *            - the tail vertex
	 * @param head
	 *            - the head vertex
	 * @return the weight of the edge from tail to head
	 * @throws NullPointerException
	 *             if one or both of the specified elements are null and this
	 *             graph does not permit null elements
	 */
	public W getWeight(V tail, V head);

	/**
	 * Sets the weight of the edge from tail to head to the specified weight.
	 * Returns true if the weight of the edge is set successfully. Returns false
	 * otherwise. <br/>
	 * <br/>
	 * If one or both of the specified elements are not in this graph or if an
	 * edge from tail to head does not exist, then false is returned.
	 * 
	 * @param tail
	 *            - the tail vertex
	 * @param head
	 *            - the head vertex
	 * @param weight
	 *            - the weight of the edge to set
	 * @return true if the weight of the edge was set successfully, else false
	 * @throws NullPointerException
	 *             if one or more of the arguments are null and this graph does
	 *             not permit null values
	 * @throws IllegalArgumentException
	 *             if some property of one or more of the arguments prevents the
	 *             weight of the edge to be set
	 */
	public boolean setWeight(V tail, V head, W weight);

}
