package datastructure.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    Queue<NodeQ> queue;

    public BFS(){
        queue = new LinkedList<NodeQ>();
    }


    static class NodeQ{
        int data;
        List neighbours;
        boolean visited;

        public void addNeighbours(NodeQ node){
            neighbours.add(node);

        }

        public NodeQ(int data){
            this.data = data;
            neighbours = new ArrayList();
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public List getNeighbours() {
            return neighbours;
        }

        public void setNeighbours(List neighbours) {
            this.neighbours = neighbours;
        }
    }



    public static void main(String[] args) {

        NodeQ nodeQ10 = new NodeQ(10);
        NodeQ nodeQ20 = new NodeQ(20);
        NodeQ nodeQ30 = new NodeQ(30);
        NodeQ nodeQ40 = new NodeQ(40);
        NodeQ nodeQ50 = new NodeQ(50);
        NodeQ nodeQ60 = new NodeQ(60);
        NodeQ nodeQ70 = new NodeQ(70);

        nodeQ40.addNeighbours(nodeQ10);
        nodeQ40.addNeighbours(nodeQ20);
        nodeQ20.addNeighbours(nodeQ30);
        nodeQ10.addNeighbours(nodeQ50);
        nodeQ10.addNeighbours(nodeQ60);
        nodeQ60.addNeighbours(nodeQ70);

        BFS bfs = new BFS();
        bfs.breadthFirstSearch(nodeQ40);

    }

    private  void breadthFirstSearch(NodeQ node) {
        queue.add(node);
        node.visited = true;

        while(!queue.isEmpty()){
            NodeQ element = queue.remove();
            System.out.println(element.data+" ");

            List<NodeQ> neightbours =element.getNeighbours();
            for(int i = 0; i< neightbours.size() ;i++){

                NodeQ nde = neightbours.get(i);
                if(nde != null && !nde.visited){
                    queue.add(nde);
                    nde.visited = true;
                }
            }

        }




    }


}
