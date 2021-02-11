import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Hangman02Test {
Hangman02 hang;
    @BeforeEach
    void setUp() {
       // hang = new Hangman02("life");
    }

    @Test
    void main() {

    }

    @Test
    void guess() {

    }

//    @Test
//    void getAnswer(){
//        assertEquals("life", hang.getAnswer());//change to sadness and test will fail
//    }
//
//    @Test
//    void setAnswer(){
//    hang.setAnswer("sadness");
//    assertEquals("sadness", hang.getAnswer());
//    }

    @Test
    void check() {
        assertTrue(hang.check("a", "sadness"), "You guess incorrectly");
    }
}