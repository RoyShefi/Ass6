package arkanoid.game;

import java.io.File;

/**
 * @author Roey Shefi & Oded Thaller
 * @version 1.0
 * @since 07/04/2016
 */

public class Ass6Game {

    /**
     * Main program.
     * <p>
     * Creates a new game and runs it.
     * <p>
     *
     * @param args arguments.
     */
    public static void main(String[] args) {
        // The default.
        String input = "definitions/level_sets.txt";
        File highscores = new File("highscores.ser");
        // If there given a run time argument.
        if (args.length > 0) {
            input = args[0];
        }
        // Run the main class.
        new Main(new HighScoresTable((int) highscores.length()), highscores, input).run();
    }

}
