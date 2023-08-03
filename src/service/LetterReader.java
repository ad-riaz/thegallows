package service;

import exceptions.IlligalInputLengthException;

import java.util.Scanner;

public class LetterReader {

    public static String read(Scanner scanner) {
        String string = "";
        System.out.print("\nУгадайте любую букву в слове: ");
        while(string.length() != 1) {
            string = scanner.nextLine().toUpperCase();
            if (string.length() > 1) try {
                throw new IlligalInputLengthException("Вы ввели целую строку. Необходимо ввести одну букву!");
            } catch (IlligalInputLengthException e) {
                System.out.println(e.getMessage());
            }
        }
        return string;
    }
}
