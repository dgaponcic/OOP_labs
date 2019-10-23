package lab4;

import java.io.FileNotFoundException;
import java.util.List;

public class Application {
    private String filePath;

    Application(String  path) {
        this.filePath = path;
    }

    public void run() throws FileNotFoundException {
        Reader reader = new Reader(filePath);

        List<String> expressions = reader.getFileContents();
        for(String currentExpression: expressions) {
            Expression expression = new Expression(currentExpression);
            expression.print();
            System.out.println(expression.isValid());
        }
    }
}
