package service;

import exceptions.VocabularyIsEmptyException;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

public class VocabularyWordReader {
    private static final String fileName = String.valueOf(Paths.get("src", "resources", "vocabulary.txt"));

    private ArrayList<String> readFile(String fileName) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        return lines;
    }

    public String getWord() {
        ArrayList<String> words = readFile(fileName);
        if (words.isEmpty()) {
            throw new VocabularyIsEmptyException();
        }
        return words.get(new Random().nextInt(words.size())).toUpperCase();
    }
}
