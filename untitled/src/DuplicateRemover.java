import java.util.*;
import java.io.*;
import java.io.FileWriter;

public class DuplicateRemover {
    //creating instance variable of set of strings
    private HashSet<String> uniqueWords =  new HashSet<String>();

    public void remove(String dataFile) throws FileNotFoundException {
        Scanner scnr = new Scanner(new File(dataFile));
        String wordCheck;

        while (scnr.hasNext()) {
            wordCheck = scnr.next();
            uniqueWords.add(wordCheck);
        }
        //System.out.println(uniqueWords);
        scnr.close();
    }

    public void write(String outputFile) throws IOException {
        File file = new File(outputFile);
        file.createNewFile();

        FileWriter fileWriter = new FileWriter(outputFile);
        String uniqueWordOutput = "";

        for (String word : uniqueWords) {
            uniqueWordOutput = uniqueWordOutput + " ";
        }
        fileWriter.write(uniqueWordOutput);
        fileWriter.close();
    }
}

