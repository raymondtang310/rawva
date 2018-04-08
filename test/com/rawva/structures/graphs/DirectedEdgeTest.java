package com.rawva.structures.graphs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DirectedEdgeTest {

	@Test
	public void testNotEqual() {
		DirectedEdge<Integer> edge1 = new DirectedEdge<>(1, null);
		DirectedEdge<Integer> edge2 = new DirectedEdge<>(1, 2);
		assertFalse(edge1.equals(edge2));
		assertFalse(edge2.equals(edge1));
	}

	@Test
	public void testSameTailHeadOrderIsEqual() {
		DirectedEdge<Integer> edge1 = new DirectedEdge<>(1, 2);
		DirectedEdge<Integer> edge2 = new DirectedEdge<>(1, 2);
		assertTrue(edge1.equals(edge2));
		assertTrue(edge2.equals(edge1));
	}

	@Test
	public void testDifferentTailHeadOrderIsNotEqual() {
		DirectedEdge<Integer> edge1 = new DirectedEdge<>(1, 2);
		DirectedEdge<Integer> edge2 = new DirectedEdge<>(2, 1);
		assertFalse(edge1.equals(edge2));
		assertFalse(edge2.equals(edge1));
	}

	@Test
	public void testEqualsWithNulls() {
		DirectedEdge<Integer> edge1 = new DirectedEdge<>(null, 2);
		DirectedEdge<Integer> edge2 = new DirectedEdge<>(null, 2);
		assertTrue(edge1.equals(edge2));
		assertTrue(edge2.equals(edge1));

		edge1 = new DirectedEdge<>(2, null);
		edge2 = new DirectedEdge<>(null, 2);
		assertFalse(edge1.equals(edge2));
		assertFalse(edge2.equals(edge1));
	}

	@Test
	public void testSameObjectIsEqual() {
		DirectedEdge<Integer> edge = new DirectedEdge<>(1, 2);
		assertTrue(edge.equals(edge));
	}

	@Test
	public void testGetTail() {
		DirectedEdge<Integer> edge = new DirectedEdge<>(1, 2);
		assertEquals(new Integer(1), edge.getTail());
	}

	@Test
	public void testGetHead() {
		DirectedEdge<Integer> edge = new DirectedEdge<>(1, 2);
		assertEquals(new Integer(2), edge.getHead());
	}

	@Test
	public void testNullGetTail() {
		DirectedEdge<Integer> edge = new DirectedEdge<>(null, 2);
		assertEquals(null, edge.getTail());
	}

	@Test
	public void testNullGetHead() {
		DirectedEdge<Integer> edge = new DirectedEdge<>(1, null);
		assertEquals(null, edge.getHead());
	}

}
