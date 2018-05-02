package datastructure.T25Algo.DijkstraShortestPathProblem;


import datastructure.graphs.Graph;

import java.util.*;

/**
 * Algorithm to find shortest path on weightted graph
 * <p>
 * A graph has vertex and edges
 * <p>
 * vertext==>City Name
 * edges==>distance between two cities  or
 * the roads are the edges with some weigth
 * <p>
 * find the shortest path
 * <p>
 * <p>
 * Set distance to startNode to zero.
 * Set all other distances to an infinite value.
 * We add the startNode to the unsettled nodes set.
 * While the unsettled nodes set is not empty we:
 * Choose an evaluation node from the unsettled nodes set,
 * the evaluation node should be the one with the lowest distance
 * from the source.
 * <p>
 * Calculate new distances to direct neighbors by keeping the lowest
 * distance at each evaluation.
 * <p>
 * Add neighbors that are not yet settled to the unsettled nodes set.
 */
public class ShortestPathDjiktra {

    public static Graph calculateShortestPathFromSource(Graph graph, Node source) {
        source.setDistance(0);

        Set<Node> settledNodes = new HashSet<>();
        Set<Node> unsettledNodes = new HashSet<>();

        unsettledNodes.add(source);

        while (unsettledNodes.size() != 0) {
            Node currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            for (Map.Entry<Node, Integer> adjacencyPair :
                    currentNode.getAdjacentNodes().entrySet()) {
                Node adjacentNode = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();
                if (!settledNodes.contains(adjacentNode)) {
                    calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
        }
        return graph;
    }


    private static Node getLowestDistanceNode(Set<Node> unsettledNodes) {
        Node lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Node node : unsettledNodes) {
            int nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }


    private static void calculateMinimumDistance(Node evaluationNode, Integer edgeWeigh,
                                                 Node sourceNode) {
        Integer sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }


    public static void main(String[] args) {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        nodeA.addDestination(nodeB, 10);
        nodeA.addDestination(nodeC, 15);

        nodeB.addDestination(nodeD, 12);
        nodeB.addDestination(nodeF, 15);

        nodeC.addDestination(nodeE, 10);

        nodeD.addDestination(nodeE, 2);
        nodeD.addDestination(nodeF, 1);

        nodeF.addDestination(nodeE, 5);

        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        graph = ShortestPathDjiktra.calculateShortestPathFromSource(graph, nodeA);

        List<Node> shortestPathForNodeB = Arrays.asList(nodeA);
        List<Node> shortestPathForNodeC = Arrays.asList(nodeA);
        List<Node> shortestPathForNodeD = Arrays.asList(nodeA, nodeB);
        List<Node> shortestPathForNodeE = Arrays.asList(nodeA, nodeB, nodeD);
        List<Node> shortestPathForNodeF = Arrays.asList(nodeA, nodeB, nodeD);

        for (Node node : graph.getNodes()) {
            switch (node.getName()) {
                case "B":
                    System.out.println(node
                            .getShortestPath()
                            .equals(shortestPathForNodeB));
                    break;
                case "C":
                    System.out.println(node
                            .getShortestPath()
                            .equals(shortestPathForNodeC));
                    break;
                case "D":
                    System.out.println(node
                            .getShortestPath()
                            .equals(shortestPathForNodeD));
                    break;
                case "E":
                    System.out.println(node
                            .getShortestPath()
                            .equals(shortestPathForNodeE));
                    break;
                case "F":
                    if (node.getShortestPath()
                            .equals(shortestPathForNodeF)) {
                        System.out.println("true");
                        ;
                    }
                    ;
                    break;
            }
        }
    }


}
