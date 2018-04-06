package com.rawva.structures.graphs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UndirectedEdgeTest {

	@Test
	public void testEqualSameOrder() {
		UndirectedEdge<Integer> edge1 = new UndirectedEdge<>(1, 2);
		UndirectedEdge<Integer> edge2 = new UndirectedEdge<>(1, 2);
		assertEquals(edge1, edge2);
	}

	@Test
	public void testEqualDifferentOrder() {
		UndirectedEdge<Integer> edge1 = new UndirectedEdge<>(1, 2);
		UndirectedEdge<Integer> edge2 = new UndirectedEdge<>(2, 1);
		assertEquals(edge1, edge2);
	}

}
