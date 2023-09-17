package node;
import node.link;
import java.util.ArrayList;
public class node {
    private ArrayList<link> links = new ArrayList<link>();
    private ArrayList<Integer> connectedNums = new ArrayList<Integer>();
    private int number;
    private int generation;
    public node(int g, int n){
        number = n;
        generation = g;
    }

    private node[] generateNodes(){
        node[] next = new node[2];
        next[0] = new node(generation+1, number*2);
        if(((number-4)%6) == 0){
            next[1] = new node(generation+1, (number-1)/3);
        }
        else{
            next[1] = null;
        }
        return next;
    }

    public void fillLinks(){
        node[] nodes = generateNodes();
        //System.out.println(nodes[0].number);
        links.add(new link(number, nodes[0].number));
        connectedNums.add(nodes[0].number);
        if(nodes[1]!=null){
            links.add(new link(number, nodes[1].number));
            connectedNums.add(nodes[1].number);
        }
    }

    public int getNumber(){
        return number;
    }
    public int getGeneration(){
        return generation;
    }
    public ArrayList<link> getLinks(){
        return links;
    }
    public ArrayList<Integer> getConnectedNums(){
        return connectedNums;
    }
}
