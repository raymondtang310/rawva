package com.rawva.structures.graphs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class WeightedHashGraphTest {

	@Test
	public void testDirectedAddEdge() {
		WeightedHashGraph<Integer, Integer> graph = new WeightedHashGraph<>(true);
		graph.addVertex(1);
		graph.addVertex(null);
		assertTrue(graph.addEdge(1, null));
		assertFalse(graph.addEdge(1, null));
		assertTrue(graph.addEdge(null, 1));
		assertTrue(graph.addEdge(null, null));
		assertTrue(graph.addEdge(1, 1));
		assertFalse(graph.addEdge(1, 2));
		assertFalse(graph.addEdge(2, 1));
	}

	@Test
	public void testUndirectedAddEdge() {
		WeightedHashGraph<Integer, Integer> graph = new WeightedHashGraph<>(false);
		graph.addVertex(1);
		graph.addVertex(null);
		assertTrue(graph.addEdge(1, null));
		assertFalse(graph.addEdge(1, null));
		assertFalse(graph.addEdge(null, 1));
		assertTrue(graph.addEdge(null, null));
		assertTrue(graph.addEdge(1, 1));
		assertFalse(graph.addEdge(1, 2));
		assertFalse(graph.addEdge(2, 1));
	}

	@Test
	public void testAddVertex() {
		WeightedHashGraph<Integer, Integer> graph = new WeightedHashGraph<>();
		assertTrue(graph.addVertex(1));
		assertTrue(graph.addVertex(null));
		assertFalse(graph.addVertex(null));
		assertTrue(graph.addVertex(-7));
		assertFalse(graph.addVertex(1));
	}

	@Test
	public void testDirectedContainsEdge() {
		WeightedHashGraph<Integer, Integer> directedGraph = new WeightedHashGraph<>(true);
		directedGraph.addVertex(null);
		directedGraph.addVertex(1);
		directedGraph.addEdge(1, null);
		assertTrue(directedGraph.containsEdge(1, null));
		assertFalse(directedGraph.containsEdge(null, 1));
	}

	@Test
	public void testUndirectedContainsEdge() {
		WeightedHashGraph<Integer, Integer> undirectedGraph = new WeightedHashGraph<>(false);
		undirectedGraph.addVertex(null);
		undirectedGraph.addVertex(1);
		undirectedGraph.addEdge(1, null);
		assertTrue(undirectedGraph.containsEdge(1, null));
		assertTrue(undirectedGraph.containsEdge(null, 1));
	}

	@Test
	public void testContainsVertex() {
		WeightedHashGraph<Integer, Integer> graph = new WeightedHashGraph<>();
		graph.addVertex(-1);
		graph.addVertex(null);
		assertTrue(graph.containsVertex(null));
		assertTrue(graph.containsVertex(-1));
		assertFalse(graph.containsVertex(1));
		assertFalse(graph.containsVertex(2));
	}

	@Test
	public void testDirectedGetAdjacentElements() {
		WeightedHashGraph<Integer, Integer> directedGraph = new WeightedHashGraph<>(true);
		directedGraph.addVertex(1);
		directedGraph.addVertex(2);
		directedGraph.addVertex(3);
		directedGraph.addEdge(1, 2);
		directedGraph.addEdge(1, 3);
		directedGraph.addEdge(3, 2);
		Set<Integer> neighbors1 = new HashSet<>();
		neighbors1.add(2);
		neighbors1.add(3);
		Set<Integer> neighbors2 = new HashSet<>();
		Set<Integer> neighbors3 = new HashSet<>();
		neighbors3.add(2);
		assertEquals(neighbors1, directedGraph.getAdjacentElements(1));
		assertEquals(neighbors2, directedGraph.getAdjacentElements(2));
		assertEquals(neighbors3, directedGraph.getAdjacentElements(3));
	}

	@Test
	public void testUndirectedGetAdjacentElements() {
		WeightedHashGraph<Integer, Integer> undirectedGraph = new WeightedHashGraph<>(false);
		undirectedGraph.addVertex(1);
		undirectedGraph.addVertex(2);
		undirectedGraph.addVertex(3);
		undirectedGraph.addEdge(1, 2);
		undirectedGraph.addEdge(1, 3);
		undirectedGraph.addEdge(3, 2);
		Set<Integer> neighbors1 = new HashSet<>();
		neighbors1.add(2);
		neighbors1.add(3);
		Set<Integer> neighbors2 = new HashSet<>();
		neighbors2.add(1);
		neighbors2.add(3);
		Set<Integer> neighbors3 = new HashSet<>();
		neighbors3.add(1);
		neighbors3.add(2);
		assertEquals(neighbors1, undirectedGraph.getAdjacentElements(1));
		assertEquals(neighbors2, undirectedGraph.getAdjacentElements(2));
		assertEquals(neighbors3, undirectedGraph.getAdjacentElements(3));
	}

	@Test
	public void testDirectedGetNumberOfEdges() {
		WeightedHashGraph<Integer, Integer> directedGraph = new WeightedHashGraph<>(true);
		directedGraph.addVertex(1);
		directedGraph.addVertex(2);
		directedGraph.addVertex(3);
		directedGraph.addEdge(1, 2);
		directedGraph.addEdge(1, 3);
		directedGraph.addEdge(3, 2);
		directedGraph.addEdge(2, 1);
		directedGraph.addEdge(1, 2);
		assertEquals(4, directedGraph.getNumberOfEdges());
	}

	@Test
	public void testUndirectedGetNumberOfEdges() {
		WeightedHashGraph<Integer, Integer> undirectedGraph = new WeightedHashGraph<>(false);
		undirectedGraph.addVertex(1);
		undirectedGraph.addVertex(2);
		undirectedGraph.addVertex(3);
		undirectedGraph.addEdge(1, 2);
		undirectedGraph.addEdge(1, 3);
		undirectedGraph.addEdge(3, 2);
		undirectedGraph.addEdge(2, 1);
		undirectedGraph.addEdge(1, 2);
		assertEquals(3, undirectedGraph.getNumberOfEdges());
	}

	@Test
	public void testGetNumberOfVertices() {
		WeightedHashGraph<Integer, Integer> graph = new WeightedHashGraph<>();
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		graph.addVertex(null);
		graph.addVertex(null);
		graph.addVertex(2);
		assertEquals(4, graph.getNumberOfVertices());
	}

	@Test
	public void testGetVertices() {
		WeightedHashGraph<Integer, Integer> graph = new WeightedHashGraph<>();
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		graph.addVertex(null);
		graph.addVertex(null);
		graph.addVertex(2);

		Set<Integer> vertices = new HashSet<>();
		vertices.add(1);
		vertices.add(2);
		vertices.add(3);
		vertices.add(null);
		assertEquals(vertices, graph.getVertices());
	}

	@Test
	public void testDirectedGetWeight() {
		WeightedHashGraph<Integer, String> graph = new WeightedHashGraph<>(true);
		graph.addVertex(1);
		graph.addVertex(null);
		graph.addVertex(-2);
		assertTrue(graph.addEdge(1, null, "weight"));
		assertFalse(graph.addEdge(1, null));
		assertTrue(graph.addEdge(null, 1));
		assertTrue(graph.addEdge(-2, 1, null));
		assertEquals("weight", graph.getWeight(1, null));
		assertEquals(null, graph.getWeight(null, 1));
		assertEquals(null, graph.getWeight(-2, 1));
		assertEquals(null, graph.getWeight(5, 6));
	}

	@Test
	public void testUndirectedGetWeight() {
		WeightedHashGraph<Integer, String> graph = new WeightedHashGraph<>(false);
		graph.addVertex(1);
		graph.addVertex(null);
		graph.addVertex(-2);
		assertTrue(graph.addEdge(1, null, "weight"));
		assertFalse(graph.addEdge(1, null));
		assertFalse(graph.addEdge(null, 1));
		assertTrue(graph.addEdge(-2, 1, null));
		assertEquals("weight", graph.getWeight(1, null));
		assertEquals("weight", graph.getWeight(null, 1));
		assertEquals(null, graph.getWeight(-2, 1));
		assertEquals(null, graph.getWeight(5, 6));
	}

	@Test
	public void testDirectedSetWeight() {
		WeightedHashGraph<Integer, String> graph = new WeightedHashGraph<>(true);
		graph.addVertex(1);
		graph.addVertex(null);
		graph.addVertex(-2);
		assertTrue(graph.addEdge(1, null, "weight"));
		assertFalse(graph.addEdge(1, null));
		assertTrue(graph.addEdge(null, 1));
		assertTrue(graph.addEdge(-2, 1, null));
		assertEquals("weight", graph.setWeight(1, null, "new weight"));
		assertEquals(null, graph.setWeight(null, 1, "some other weight"));
		assertEquals(null, graph.setWeight(-2, 1, "another weight"));
		assertEquals(null, graph.setWeight(5, 6, "not settable"));
	}

	@Test
	public void testUndirectedSetWeight() {
		WeightedHashGraph<Integer, String> graph = new WeightedHashGraph<>(false);
		graph.addVertex(1);
		graph.addVertex(null);
		graph.addVertex(-2);
		assertTrue(graph.addEdge(1, null, "weight"));
		assertFalse(graph.addEdge(1, null));
		assertFalse(graph.addEdge(null, 1));
		assertTrue(graph.addEdge(-2, 1, null));
		assertEquals("weight", graph.setWeight(1, null, "new weight"));
		assertEquals("new weight", graph.setWeight(null, 1, "some other weight"));
		assertEquals(null, graph.setWeight(-2, 1, "another weight"));
		assertEquals(null, graph.setWeight(5, 6, "not settable"));
	}

}
