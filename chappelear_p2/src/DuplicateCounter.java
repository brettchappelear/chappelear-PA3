import java.util.*;
import java.io.*;
import java.util.HashMap;

public class DuplicateCounter {
    private HashMap<String, Integer> wordCounter = new HashMap<>();

    public void count(String dataFile) throws FileNotFoundException {
        Scanner scnr = new Scanner(new File(dataFile));
        String compareWord;

        while (scnr.hasNext()) {
            compareWord = scnr.next();
            if (wordCounter.containsKey(compareWord)) {
                wordCounter.put(compareWord, wordCounter.get(compareWord) + 1);
            }
            else {
                wordCounter.put(compareWord, 1);
            }
        }
        scnr.close();
    }

    public void write(String outputFile) throws IOException {
        //File file = new File(outputFile);
        //file.createNewFile();

        FileWriter fileWriter = new FileWriter(outputFile);
        String countOutput;
        countOutput = "";

        for (String word : wordCounter.keySet()) {
            countOutput = countOutput + word + ": " + wordCounter.get(word) + " ";
        }
        fileWriter.write(countOutput);
        fileWriter.close();
    }

}
