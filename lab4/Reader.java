package lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    public File file;
    private Scanner scanner;
    public List<String> contents = new ArrayList<>();

    Reader(String relativeFilePath) throws FileNotFoundException {
        this.file = new File(relativeFilePath);
        this.scanner = new Scanner(file);
    }

     List<String> getFileContents() {
         for (Scanner it = scanner; it.hasNext(); ) {
             contents.add(scanner.nextLine());
         }
        return contents;
    }
}

