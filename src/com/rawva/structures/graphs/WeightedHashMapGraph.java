package com.rawva.structures.graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This is an implementation for a weighted graph that provides quick lookup
 * time for both elements (vertices) and edges. <br/>
 * <br/>
 * One null element is allowed to be placed in this graph as a vertex. Edge
 * weights are allowed to be null. Duplicate elements cannot be added. Duplicate
 * edges cannot be added.
 * 
 * @author Raymond Tang
 *
 * @param <V>
 *            - the type of elements in this graph
 * @param <W>
 *            - the type of edge weights in this graph
 */
public class WeightedHashMapGraph<V, W> implements WeightedGraph<V, W> {

	private final boolean isDirected;
	private final Map<V, Set<V>> vertexNeighbors;
	private final Map<Edge<V>, W> edgeWeights;

	/**
	 * Constructs an empty WeightedHashMapGraph.
	 * 
	 * @param isDirected
	 *            - value to specify if this graph is directed (true) or
	 *            undirected (false)
	 */
	public WeightedHashMapGraph(boolean isDirected) {
		this.isDirected = isDirected;
		this.vertexNeighbors = new HashMap<>();
		this.edgeWeights = new HashMap<>();
	}

	/**
	 * Constructs an empty, directed WeightedHashMapGraph.
	 */
	public WeightedHashMapGraph() {
		this(true);
	}

	/**
	 * Adds an edge from the specified tail element to the specified head
	 * element if the edge does not already exist. Returns true if the edge was
	 * added to this graph after this call. If the edge specified by the tail
	 * and head elements already exists, then false is returned. <br/>
	 * <br/>
	 * In order to add an edge between two elements, it is required that the two
	 * elements have already been added to this graph. If the specified elements
	 * are not in this graph, then no edge is added and false is returned.
	 * 
	 * @param tail
	 *            - the tail vertex
	 * @param head
	 *            - the head vertex
	 * @return true if the edge was added to this graph, else false
	 */
	@Override
	public boolean addEdge(V tail, V head) {
		return addEdge(tail, head, null);
	}

	/**
	 * Adds an edge with the specified weight from the specified tail element to
	 * the specified head element if the edge does not already exist. Returns
	 * true if the edge was added to this graph after this call. If the edge
	 * specified by the tail and head elements already exists, then false is
	 * returned. <br/>
	 * <br/>
	 * In order to add an edge between two elements, it is required that the two
	 * elements have already been added to this graph. If the specified elements
	 * are not in this graph, then no edge is added and false is returned.
	 * 
	 * @param tail
	 *            - the tail vertex
	 * @param head
	 *            - the head vertex
	 * @param weight
	 *            - the weight of the edge
	 * @return true if the edge was added to this graph, else false
	 */
	@Override
	public boolean addEdge(V tail, V head, W weight) {
		if (containsEdge(tail, head)) {
			return false;
		}
		Edge<V> edge = isDirected ? new DirectedEdge<>(tail, head) : new UndirectedEdge<>(tail, head);
		edgeWeights.put(edge, weight);
		vertexNeighbors.get(tail).add(head);
		if (!isDirected) {
			vertexNeighbors.get(head).add(tail);
		}
		return true;
	}

	/**
	 * Adds the specified element to this graph as a vertex. Returns true if the
	 * element was successfully added to this graph after this call. <br/>
	 * <br/>
	 * Duplicate elements cannot be inserted. If this call is made with an
	 * element that is already present in this graph, false is returned.
	 * 
	 * @param elem
	 *            - the element to add
	 * @return true if the element was added to this graph after this call, else
	 *         false
	 */
	@Override
	public boolean addVertex(V elem) {
		if (vertexNeighbors.containsKey(elem)) {
			return false;
		}
		vertexNeighbors.put(elem, new HashSet<>());
		return true;
	}

	/**
	 * Returns true if this graph contains an edge from tail to head. Returns
	 * false otherwise. <br/>
	 * <br/>
	 * If this graph is undirected, the order of the arguments does not matter,
	 * i.e, containsEdge(tail, head) == containsEdge(head, tail).
	 * 
	 * @param tail
	 *            - the tail vertex of the edge who presence in this graph is to
	 *            be tested
	 * @param head
	 *            - the head vertex of the edge who presence in this graph is to
	 *            be tested
	 * @return true if this graph contains an edge from tail to head, else false
	 */
	@Override
	public boolean containsEdge(V tail, V head) {
		return isDirected ? edgeWeights.containsKey(new DirectedEdge<>(tail, head))
				: edgeWeights.containsKey(new UndirectedEdge<>(tail, head));
	}

	/**
	 * Returns true if this graph contains the specified element. Returns false
	 * otherwise.
	 * 
	 * @param elem
	 *            - the element whose presence in this graph is to be tested
	 * @return true if this graph contains the specified element, else false
	 */
	@Override
	public boolean containsVertex(V elem) {
		return vertexNeighbors.containsKey(elem);
	}

	/**
	 * Returns a set containing all elements that are adjacent to this element.
	 * If this element does not have any outgoing edges, an empty set is
	 * returned.
	 * 
	 * @param elem
	 *            - the element whose neighbors we want
	 * @return a set of elements that are adjacent to this element
	 */
	@Override
	public Set<V> getAdjacentElements(V elem) {
		return vertexNeighbors.get(elem);
	}

	/**
	 * Returns the number of edges in this graph.
	 * 
	 * @return the number of edges in this graph
	 */
	@Override
	public int getNumberOfEdges() {
		return edgeWeights.size();
	}

	/**
	 * Returns the number of elements (vertices) in this graph.
	 * 
	 * @return the number of elements in this graph
	 */
	@Override
	public int getNumberOfVertices() {
		return vertexNeighbors.size();
	}

	/**
	 * Returns the set of elements (vertices) in this graph.
	 * 
	 * @return the set of elements (vertices) in this graph
	 */
	@Override
	public Set<V> getVertices() {
		return vertexNeighbors.keySet();
	}

	/**
	 * Returns the weight of the edge from tail to head if the edge exists and
	 * has an associated weight, or null otherwise. A null return may also
	 * indicate that the weight of the edge was set to null.
	 * 
	 * @param tail
	 *            - the tail vertex
	 * @param head
	 *            - the head vertex
	 * @return the weight of the edge from tail to head
	 */
	@Override
	public W getWeight(V tail, V head) {
		Edge<V> edge = isDirected ? new DirectedEdge<>(tail, head) : new UndirectedEdge<>(tail, head);
		return edgeWeights.get(edge);
	}

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
	 */
	@Override
	public boolean setWeight(V tail, V head, W weight) {
		Edge<V> edge = isDirected ? new DirectedEdge<>(tail, head) : new UndirectedEdge<>(tail, head);
		if (!edgeWeights.containsKey(edge)) {
			return false;
		}
		edgeWeights.put(edge, weight);
		return true;
	}

}
