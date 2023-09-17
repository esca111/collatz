import handler.handler;
public class Main {
    public static void main(String[] args) {
        /*for(int i = 1; i<40; i++){
            handler start = new handler();
            start.runGenerations(i);
            System.out.println(start.getSize());
        }*/
        handler start = new handler();
        start.runGenerations(5);
        start.generateNodeTreeFile();

    }
}