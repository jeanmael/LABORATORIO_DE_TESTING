package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void emptyString() {
        int words = new CountLetters().count("");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void nullString() {
        int words = new CountLetters().count(null);
        Assertions.assertEquals(0, words);
    }

}
