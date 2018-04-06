package com.rawva.structures.graphs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WeightedHashMapGraphTest {

	@Test
	public void testDirectedContainsEdge() {
		WeightedHashMapGraph<Integer, Integer> directedGraph = new WeightedHashMapGraph<>(true);
		directedGraph.addVertex(1);
		directedGraph.addVertex(2);
		directedGraph.addEdge(1, 2);
		assertTrue(directedGraph.containsEdge(1, 2));
		assertFalse(directedGraph.containsEdge(2, 1));
	}

	@Test
	public void testUndirectedContainsEdge() {
		WeightedHashMapGraph<Integer, Integer> undirectedGraph = new WeightedHashMapGraph<>(false);
		undirectedGraph.addVertex(1);
		undirectedGraph.addVertex(2);
		undirectedGraph.addEdge(1, 2);
		assertTrue(undirectedGraph.containsEdge(1, 2));
		assertTrue(undirectedGraph.containsEdge(2, 1));
	}

}
