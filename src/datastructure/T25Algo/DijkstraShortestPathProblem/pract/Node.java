package datastructure.T25Algo.DijkstraShortestPathProblem.pract;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Node {

    String name;

    public Node(String name) {
        this.name = name;
    }

    Map adjacencyNode = new HashMap();


    LinkedList shortestDistance = new LinkedList();

    private int distance = Integer.MAX_VALUE;


    public void addDestination(Node destination, int distance) {
        adjacencyNode.put(destination, distance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map getAdjacencyNode() {
        return adjacencyNode;
    }

    public void setAdjacencyNode(Map adjacencyNode) {
        this.adjacencyNode = adjacencyNode;
    }

    public LinkedList getShortestDistance() {
        return shortestDistance;
    }

    public void setShortestDistance(LinkedList shortestDistance) {
        this.shortestDistance = shortestDistance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
