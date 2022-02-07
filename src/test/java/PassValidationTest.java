import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassValidationTest {

    @BeforeEach
    void setUp() {
      //  String pass = "artem";
    }

    @Test
    void main() {
    }

    @Test
    void ifPassEmpty() {
       // PassValidad.ifPassEmpty("");
      //  assertEquals("Password is not empty.");
        assertEquals("Password is not empty", PassValidation.ifPassEmpty("artem"));
    }

    @Test
    void passLenght() {
        assertEquals("Password is ok", PassValidation.passLength("artem",5));
    }

    @Test
    void lowCase() {
        boolean result  =  PassValidation.lowCase("artem");
        assertTrue(result);
    }

    @Test
    void upperCase() {
        boolean result  =  PassValidation.upperCase("artem");
        assertFalse(result);
    }

    @Test
    void ifPassEqual() {
        assertEquals("Pass is valid", PassValidation.ifPassEqual("artem","artem"));
    }
}