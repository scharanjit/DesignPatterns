package datastructure.T25Algo.DijkstraShortestPathProblem.pract;

import java.util.HashSet;
import java.util.Set;

public class Djikstra {


    public static void main(String[] args) {
        Node nodeA= new Node("A");
        Node nodeB= new Node("B");
        Node nodeC= new Node("C");
        Node nodeD= new Node("D");
        Node nodeE= new Node("E");
        Node nodeF= new Node("F");



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


        Djikstra djikstra = new Djikstra();

        djikstra.shortestPath(graph,nodeA);
    }

    private void shortestPath(Graph graph, Node source) {

        source.setDistance(0);


        Set<Node> unsettledNode = new HashSet<>();
        Set<Node> settledNode = new HashSet<>();

        unsettledNode.add(source);


        while(unsettledNode.size() !=0){

        }



    }
}
