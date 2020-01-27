import org.junit.*;
import static org.junit.Assert.*;

public class CipherTest {

    @Test
    public void Cipher_changePositionOfLetter_String() {
        Cipher testCipher = new Cipher();
        String expectedOutput = "w";
        assertEquals(expectedOutput, testCipher.encrypt("t", 3));
    }
}