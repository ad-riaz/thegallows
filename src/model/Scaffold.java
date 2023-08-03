package model;

import java.util.ArrayList;

public class Scaffold {
    private static final String GALLOWS_0_MISTAKES =
            "__________\n" +
            "| /\n"+
            "|/\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "===========" +
            "\n";

    private static final String GALLOWS_ONE_MISTAKE =
            "__________\n" +
            "| /    |\n"+
            "|/\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "===========" +
            "\n";

    private static final String GALLOWS_TWO_MISTAKES =
            "__________\n" +
            "| /    |\n"+
            "|/    ( )\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "===========" +
            "\n";

    private static final String GALLOWS_THREE_MISTAKES =
            "__________\n" +
            "| /    |\n"+
            "|/    ( )\n" +
            "|      |\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "===========" +
            "\n";

    private static final String GALLOWS_FOUR_MISTAKES =
            "__________\n" +
            "| /    |\n"+
            "|/    ( )\n" +
            "|      |\n" +
            "|     /|\\\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "===========" +
            "\n";

    private static final String GALLOWS_FIVE_MISTAKES =
            "__________\n" +
            "| /    |\n"+
            "|/    ( )\n" +
            "|      |\n" +
            "|     /|\\\n" +
            "|      |\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "===========" +
            "\n";

    private static final String GALLOWS_SIX_MISTAKES =
            "__________\n" +
            "| /    |\n"+
            "|/    ( )\n" +
            "|      |\n" +
            "|     /|\\\n" +
            "|      |\n" +
            "|     /|\\\n" +
            "|\n" +
            "|\n" +
            "===========" +
            "\n";

    private ArrayList<String> scaffolds = new ArrayList<>();
    public Scaffold() {
        scaffolds.add(GALLOWS_0_MISTAKES);
        scaffolds.add(GALLOWS_ONE_MISTAKE);
        scaffolds.add(GALLOWS_TWO_MISTAKES);
        scaffolds.add(GALLOWS_THREE_MISTAKES);
        scaffolds.add(GALLOWS_FOUR_MISTAKES);
        scaffolds.add(GALLOWS_FIVE_MISTAKES);
        scaffolds.add(GALLOWS_SIX_MISTAKES);
    }

    public ArrayList<String> getScaffolds() {
        return scaffolds;
    }
}
