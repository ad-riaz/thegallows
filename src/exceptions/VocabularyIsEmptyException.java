package exceptions;

import java.awt.event.FocusEvent;
import java.io.IOException;

public class VocabularyIsEmptyException extends RuntimeException {
    public VocabularyIsEmptyException() {
        super("Словарь пуст!");
    }
}
