package com.rawva.structures.graphs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class DirectedEdgeTest {

	@Test
	public void testEqualSameOrder() {
		DirectedEdge<Integer> edge1 = new DirectedEdge<>(1, 2);
		DirectedEdge<Integer> edge2 = new DirectedEdge<>(1, 2);
		assertEquals(edge1, edge2);
	}

	@Test
	public void testNotEqualDifferentOrder() {
		DirectedEdge<Integer> edge1 = new DirectedEdge<>(1, 2);
		DirectedEdge<Integer> edge2 = new DirectedEdge<>(2, 1);
		assertNotEquals(edge1, edge2);
	}

}
