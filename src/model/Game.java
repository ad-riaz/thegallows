package model;

import service.LetterReader;
import service.VocabularyWordReader;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Game {
    private ArrayList<String> gallows = new Scaffold().getScaffolds();
    private Set<String> usedLetters;

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Введите 1, если вы хотите начать новую игру.\nВведите 0, если вы хотите выйти:");
            int startNumber = 0;
            try {
                startNumber = Integer.parseInt(scanner.nextLine());
                if (startNumber != 0 && startNumber != 1) throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод.");
                continue;
            }
            if (startNumber == 0) {
                break;
            }
            startNewGame(scanner);
        }

        scanner.close();
    }

    private void startNewGame(Scanner scanner) {
        String word = new VocabularyWordReader().getWord();
        StringBuilder mask = new StringBuilder(word.replaceAll("[^A-Za-z]", "*"));
        usedLetters = new HashSet<>();
        int mistakes = 0;

        // Start game
        printStartMessage();
        printScaffolds(mistakes);
        System.out.println("Слово: " + mask);
        while (mistakes != 6 && !mask.toString().equals(word)) {
            String letter = LetterReader.read(scanner);

            if (word.contains(letter)) {
                for (int i = 0; i < word.length(); i++) {
                    char let = letter.charAt(0);
                    if (word.charAt(i) == let) {
                        usedLetters.add(letter);
                        mask.setCharAt(i, let);
                    }
                }
                printCurrentStats(mask, usedLetters, mistakes);
            } else {
                System.out.println("\n\nОшибка! =)");
                usedLetters.add(letter);
                mistakes++;
                printScaffolds(mistakes);
                printCurrentStats(mask, usedLetters, mistakes);
            }
        }

        if (mask.toString().equals(word)) {
            printWinMessage();
        } else if(mistakes == 6) {
            printLooseMessage(word);
        }
    }

    private void printScaffolds(int mistakes) {
        System.out.println(gallows.get(mistakes));
    }

    private void printStartMessage() {
        System.out.println("Игра началась!");
    }

    private void printCurrentStats(StringBuilder mask, Set<String> usedLetters, int mistakes) {
        System.out.println("Слово: " + mask);
        System.out.println("Использованные буквы: " + usedLetters);
        System.out.println("Количество ошибок: " + mistakes);
    }

    private void printWinMessage() {
        System.out.println("Игра закончена! Вы выиграли! =) \n\n");
    }

    private void printLooseMessage(String word) {
        System.out.println("Игра закончена! Вы не угадали слово " + word +" =( \n\n");
    }
}
