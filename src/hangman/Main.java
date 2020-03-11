package hangman;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        EvilHangmanGame game = new EvilHangmanGame();

        //Pass in Dictionary file, wordLength
        game.startGame(new File(args[0]), Integer.getInteger(args[1]));



    }
}
