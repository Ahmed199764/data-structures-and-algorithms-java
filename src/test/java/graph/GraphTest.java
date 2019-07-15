package graph;

import hashTable.HashTable;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void addNode() {
        Graph graph = new Graph();
        Node cat = graph.addNode("cat");
        Node dog = graph.addNode("dog");
        Node hamster = graph.addNode("hamster");

        assertTrue("Should return true", graph.getSize() == 3);
        assertTrue("Should return cat", graph.getNodes().contains(cat));
        assertTrue("Should return dog", graph.getNodes().contains(dog));
        assertTrue("Should return hamster", graph.getNodes().contains(hamster));
    }

    @Test
    public void addEdge() {
        Graph graph = new Graph();
        Node cat = graph.addNode("cat");
        Node dog = graph.addNode("dog");
        Node hamster = graph.addNode("hamster");

        assertTrue("Should be true", graph.addEdge(cat, dog));
        assertTrue("Should be true", graph.addEdge(cat, hamster));

    }

    @Test
    public void getNodes() {
        Graph graph = new Graph();
        Node cat = graph.addNode("cat");
        Node dog = graph.addNode("dog");
        Node hamster = graph.addNode("hamster");

        HashSet<Node> expected = new HashSet<>();
        expected.add(cat);
        expected.add(dog);
        expected.add(hamster);

        assertTrue("Should return True", graph.getNodes().equals(expected));
    }

    @Test
    public void addNeighborNoWeight(){
        Graph graph = new Graph();
        Node cat = graph.addNode("cat");
        Node dog = graph.addNode("dog");
        Node hamster = graph.addNode("hamster");

        assertTrue("Should return true", cat.addNeighbor(dog));
    }

    @Test
    public void addNeighborWithWeight(){
        Graph graph = new Graph();
        Node cat = graph.addNode("cat");
        Node dog = graph.addNode("dog");
        Node hamster = graph.addNode("hamster");

        assertTrue("Should return true", cat.addNeighbor(dog, 50));
    }

    @Test
    public void getNeighbors() {
        Graph graph = new Graph();
        Node cat = graph.addNode("cat");
        Node dog = graph.addNode("dog");
        Node hamster = graph.addNode("hamster");

        cat.addNeighbor(dog);
        cat.addNeighbor(hamster);

        HashSet expected = new HashSet<>();
        expected.add("dog");
        expected.add("hamster");

        assertEquals("Should equal 2",expected.size(), graph.getNeighbors(cat).size());
        assertEquals("Should equal", expected.toString().trim(), graph.getNeighbors(cat).toString().trim());
    }

    @Test
    public void getSize() {
        Graph graph = new Graph();
        graph.addNode("cat");
        graph.addNode("dog");
        graph.addNode("hamster");

        assertEquals("Should return true", 3,  graph.getSize());

        graph.addNode("rabbit");
        graph.addNode("frog");
        graph.addNode("guinea pig");
        graph.addNode("cow");

        assertEquals("Should return true", 7,  graph.getSize());
    }
}