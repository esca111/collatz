package handler;
import node.*;
import java.util.ArrayList;
import handler.generation;
public class handler {
    private java.util.ArrayList<Integer> numbers = new ArrayList<Integer>();
    private java.util.ArrayList<generation> generations = new ArrayList<generation>();
    public void runGenerations(int iterations){
        generation tempGen = new generation();
        generation newGen = new generation();
        tempGen.firstGeneration();
        generations.add(tempGen);
        System.out.print("Generation 1 has ");
        System.out.print(tempGen.getSize());
        System.out.println(" numbers.");
        numbers.add(1);
        for(int x = 1; x < iterations; x++){
            newGen = new generation();
            numbers = newGen.spawnGeneration(tempGen, numbers);
            generations.add(newGen);
            System.out.print("Generation ");
            System.out.print(x+1);
            System.out.print(" has ");
            System.out.print(newGen.getSize());
            System.out.println(" numbers.");
            tempGen = newGen;
        }
        System.out.print("In total, at generation ");
        System.out.print(iterations);
        System.out.print(", this program has found ");
        System.out.print(numbers.size());
        System.out.print(" separate numbers.");

    }
}
