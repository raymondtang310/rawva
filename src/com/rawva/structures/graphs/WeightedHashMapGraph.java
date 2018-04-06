package com.rawva.structures.graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This is an implementation for a weighted graph that provides quick lookup
 * time for both elements (vertices) and edges.
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

	public WeightedHashMapGraph(boolean isDirected) {
		this.isDirected = isDirected;
		this.vertexNeighbors = new HashMap<>();
		this.edgeWeights = new HashMap<>();
	}

	@Override
	public boolean addEdge(V tail, V head) {
		return addEdge(tail, head, null);
	}

	@Override
	public boolean addEdge(V tail, V head, W weight) {
		if (!vertexNeighbors.containsKey(tail) || !vertexNeighbors.containsKey(head)) {
			return false;
		}
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

	@Override
	public boolean addVertex(V elem) {
		if (vertexNeighbors.containsKey(elem)) {
			return false;
		}
		vertexNeighbors.put(elem, new HashSet<>());
		return true;
	}

	@Override
	public boolean containsEdge(V tail, V head) {
		return isDirected ? edgeWeights.containsKey(new DirectedEdge<>(tail, head))
				: edgeWeights.containsKey(new UndirectedEdge<>(tail, head));
	}

	@Override
	public boolean containsVertex(V elem) {
		return vertexNeighbors.containsKey(elem);
	}

	@Override
	public Set<V> getAdjacentElements(V elem) {
		return vertexNeighbors.get(elem);
	}

	@Override
	public int getNumberOfEdges() {
		return edgeWeights.size();
	}

	@Override
	public int getNumberOfVertices() {
		return vertexNeighbors.size();
	}

	@Override
	public Set<V> getVertices() {
		return vertexNeighbors.keySet();
	}

	@Override
	public W getWeight(V tail, V head) {
		Edge<V> edge = isDirected ? new DirectedEdge<>(tail, head) : new UndirectedEdge<>(tail, head);
		return edgeWeights.get(edge);
	}

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
