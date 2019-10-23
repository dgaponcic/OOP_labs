package lab4;

import java.io.FileNotFoundException;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Application app = new Application(".\\src\\lab4\\expressions\\three_expressions.txt");
        app.run();
    }
}
