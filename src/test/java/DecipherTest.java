import org.junit.*;
import static org.junit.Assert.*;

public class DecipherTest {

    @Test
    public void Decipher_changePositionOfLetter_String() {
        Decipher testDecipher = new Decipher();
        String expectedOutput = "t";
        assertEquals(expectedOutput, testDecipher.decrypt("w", 3));
    }
    @Test
    public void Decipher_changePositionOfText_String() {
        Decipher testDecipher = new Decipher();
        String expectedOutput = "rock";
        assertEquals(expectedOutput, testDecipher.decrypt("urfn", 3));
    }
}