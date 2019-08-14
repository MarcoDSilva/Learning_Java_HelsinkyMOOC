
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // if the letter has already been guessed, nothing happens
        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters

        if (!this.guessedLetters.contains(letter)) {
            this.guessedLetters += letter;

            if (!this.word.contains(letter)) {
                this.numberOfFaults++;
            }
        }
    }

    public String hiddenWord() {

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 
        // return the hidden word at the end
        String hidden = "";
        String guesses = "";
        char letterToCheck = ' ';

        for (int i = 0; i < this.word.length(); i++) {
            letterToCheck = this.word.charAt(i);
            guesses = "" + letterToCheck;

            if (this.guessedLetters.contains(guesses)) {
                hidden += guesses;
            } else {
                hidden += "_";
            }
        }

        return hidden;
    }
}
