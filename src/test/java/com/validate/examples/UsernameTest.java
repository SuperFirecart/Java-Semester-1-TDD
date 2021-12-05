package validate.examples;
import com.example.validate.Checker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsernameTest {
    @Test
    public void TestValid(){
        Checker testing = new Checker("testing@True.com", "1234abc*");
        assertTrue(testing.isAnEmail());
    }
    @Test
    public void TestInvalidEmail(){
        Checker testing = new Checker("testingFalse.com", "1234abc*");
        assertFalse(testing.isAnEmail());
    }
    @Test
    public void invalidPasswordLength(){
        Checker testing = new Checker("testingTrue.com", "1234");
        assertFalse(testing.isValidPassword());
    }
    @Test
    public void invalidPasswordNumbers(){
        Checker testing = new Checker("testingTrue.com", "abcdefg*");
        assertFalse(testing.isValidPassword());
    }
    @Test
    public void invalidPasswordLetters(){
        Checker testing = new Checker("testingTrue.com", "1234567*");
        assertFalse(testing.isValidPassword());
    }
    @Test
    public void invalidPasswordSymbols(){
        Checker testing = new Checker("testingTrue.com", "1234abcd");
        assertFalse(testing.isValidPassword());
    }
}
