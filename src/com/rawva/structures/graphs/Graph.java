package com.rawva.structures.graphs;

import java.util.Set;

/**
 * A Graph is a collection that, in addition to storing objects, can store pairs
 * of objects to represent associations between two objects. <br/>
 * <br/>
 * Terminology: <br/>
 * <br/>
 * Each object is a vertex and each pair of objects (o1, o2) is an edge from o1
 * to o2. An object o2 is called a neighbor of object o1 if and only if o1 has
 * an edge to o2. We also say that o2 is adjacent to o1 if and only if o1 has an
 * edge to o2. In an edge (o1, o2), o1 is called the tail and o2 is called the
 * head.
 * 
 * @author Raymond Tang
 * @param <V>
 *            - the type of elements (vertices) in this graph
 *
 */
public interface Graph<V> {

	/**
	 * Adds an edge from the specified tail element to the specified head
	 * element if the edge does not already exist. Returns true if the edge was
	 * added to this graph after this call. If the edge specified by the tail
	 * and head elements already exists, then false is returned.
	 * 
	 * In order to add an edge between two elements, it is required that the two
	 * elements have already been added to this graph. If the specified elements
	 * are not in this graph, then no edge is added and false is returned.
	 * 
	 * @param tail
	 *            - the tail vertex
	 * @param head
	 *            - the head vertex
	 * @return true if the edge was added to this graph after this call, else
	 *         false
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
	public boolean addEdge(V tail, V head);

	/**
	 * Adds the specified element to this graph as a vertex. Returns true if the
	 * element was added to this graph. Returns false otherwise.
	 * 
	 * @param elem
	 *            - the element to add
	 * @return true if the element was added to this graph, else false
	 * @throws ClassCastException
	 *             if the class of the specified element prevents it from being
	 *             added to this graph
	 * @throws NullPointerException
	 *             if the specified element is null and this graph does not
	 *             permit null elements
	 * @throws IllegalArgumentException
	 *             if some property of the specified element prevents it from
	 *             being added to this graph
	 * @throws IllegalStateException
	 *             if the specified element cannot be added at this time due to
	 *             insertion restrictions
	 */
	public boolean addVertex(V elem);

	/**
	 * Returns true if this graph contains an edge from tail to head. Returns
	 * false otherwise.
	 * 
	 * @param tail
	 *            - the tail vertex
	 * @param head
	 *            - the head vertex
	 * @return true if this graph contains an edge from tail to head, else false
	 */
	public boolean containsEdge(V tail, V head);

	/**
	 * Returns true if this graph contains the specified element. Returns false
	 * otherwise.
	 * 
	 * @param elem
	 *            - the element whose presence in this graph is to be tested
	 * @return true if this graph contains the specified element, else false
	 */
	public boolean containsVertex(V elem);

	/**
	 * Returns a set containing all elements that are adjacent to this element.
	 * If this element does not have any outgoing edges, an empty set is
	 * returned.
	 * 
	 * @param elem
	 *            - the element whose neighbors we want
	 * @return a set of elements that are adjacent to this element
	 */
	public Set<V> getAdjacentElements(V elem);

	/**
	 * Returns the number of edges in this graph.
	 * 
	 * @return the number of edges in this graph
	 */
	public int getNumberOfEdges();

	/**
	 * Returns the number of elements (vertices) in this graph.
	 * 
	 * @return the number of elements in this graph
	 */
	public int getNumberOfVertices();

	/**
	 * Returns the set of elements (vertices) in this graph.
	 * 
	 * @return the set of elements (vertices) in this graph
	 */
	public Set<V> getVertices();

}
