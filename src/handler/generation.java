package handler;
import node.*;
import java.util.ArrayList;
public class generation {
    private ArrayList<node> nodes = new ArrayList<node>();
    private int size = 0;

    public void firstGeneration(){
        node FirstNode = new node(0, 1);
        FirstNode.fillLinks();
        nodes.add(FirstNode);
        size = 1;
    }
    public ArrayList<Integer> spawnGeneration(generation oldGeneration, ArrayList<Integer> existingInts){
        ArrayList<Integer> connectedInts;
        for(int x = 0; x < oldGeneration.size; ++x){
            connectedInts = oldGeneration.nodes.get(x).getConnectedNums();
            for (Integer connectedInt : connectedInts) {
                if (!existingInts.contains(connectedInt)) {
                    System.out.println(connectedInt);
                    existingInts.add(connectedInt);
                    size++;
                    nodes.add(new node(oldGeneration.nodes.get(x).getGeneration() + 1, connectedInt));
                }
            }
        }
        for(node n : nodes){
            n.fillLinks();
        }
        return existingInts;
    }
    public ArrayList<node> getNodes(){
        return nodes;
    }
    public int getSize(){
        return size;
    }
}
