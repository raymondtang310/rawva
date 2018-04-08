package com.rawva.structures.graphs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UndirectedEdgeTest {

	@Test
	public void testNotEqual() {
		UndirectedEdge<Integer> edge1 = new UndirectedEdge<>(1, null);
		UndirectedEdge<Integer> edge2 = new UndirectedEdge<>(1, 2);
		assertFalse(edge1.equals(edge2));
		assertFalse(edge2.equals(edge1));
	}

	@Test
	public void testSameTailHeadOrderIsEqual() {
		UndirectedEdge<Integer> edge1 = new UndirectedEdge<>(1, 2);
		UndirectedEdge<Integer> edge2 = new UndirectedEdge<>(1, 2);
		assertTrue(edge1.equals(edge2));
		assertTrue(edge2.equals(edge1));
		assertFalse(new UndirectedEdge<>(1, null).equals(new UndirectedEdge<>(1, 1)));
	}

	@Test
	public void testDifferentTailHeadOrderIsEqual() {
		UndirectedEdge<Integer> edge1 = new UndirectedEdge<>(1, 2);
		UndirectedEdge<Integer> edge2 = new UndirectedEdge<>(2, 1);
		assertTrue(edge1.equals(edge2));
		assertTrue(edge2.equals(edge1));
	}

	@Test
	public void testEqualsWithNulls() {
		UndirectedEdge<Integer> edge1 = new UndirectedEdge<>(null, 2);
		UndirectedEdge<Integer> edge2 = new UndirectedEdge<>(null, 2);
		assertTrue(edge1.equals(edge2));
		assertTrue(edge2.equals(edge1));

		edge1 = new UndirectedEdge<>(2, null);
		edge2 = new UndirectedEdge<>(null, 2);
		assertTrue(edge1.equals(edge2));
		assertTrue(edge2.equals(edge1));
	}

	@Test
	public void testSameObjectIsEqual() {
		DirectedEdge<Integer> edge = new DirectedEdge<>(1, 2);
		assertTrue(edge.equals(edge));
	}

	@Test
	public void testGetTail() {
		UndirectedEdge<Integer> edge = new UndirectedEdge<>(1, 2);
		assertEquals(new Integer(1), edge.getTail());
	}

	@Test
	public void testGetHead() {
		UndirectedEdge<Integer> edge = new UndirectedEdge<>(1, 2);
		assertEquals(new Integer(2), edge.getHead());
	}

	@Test
	public void testNullGetTail() {
		UndirectedEdge<Integer> edge = new UndirectedEdge<>(null, 2);
		assertEquals(null, edge.getTail());
	}

	@Test
	public void testNullGetHead() {
		UndirectedEdge<Integer> edge = new UndirectedEdge<>(1, null);
		assertEquals(null, edge.getHead());
	}

}
