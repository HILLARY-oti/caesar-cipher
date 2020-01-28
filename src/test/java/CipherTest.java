import org.junit.*;
import static org.junit.Assert.*;

public class CipherTest {

    @Test
    public void Cipher_changePositionOfLetter_String() {
        Cipher testCipher = new Cipher();
        String expectedOutput = "w";
        assertEquals(expectedOutput, testCipher.encrypt("t", 3));
    }

    @Test
    public void Cipher_changePositionOfText_String() {
        Cipher testCipher = new Cipher();
        String expectedOutput = "urfn";
        assertEquals(expectedOutput, testCipher.encrypt("rock", 3));
    }
    @Test
    public void Cipher_changePositionOfSentence_String() {
        Cipher testCipher = new Cipher();
        String expectedOutput = "og aqw";
        assertEquals(expectedOutput, testCipher.encrypt("me you", 2));
    }
}