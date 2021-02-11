import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
 class HangmanTest {
Hangman02 hang;
WordBank word;
@BeforeEach

  @Test
  void check(){
 hang.check("a", "a");
 assertTrue(hang.check("a", "a"), "You guess incorrectly");
}




}
