package ro.itschool.mvnbase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckIfStringIsPalindromeTest {

    @Test
    @DisplayName(" when spaces are inserted, ignore them ")
    void whenStringHasSpaces(){

       CheckIfStringIsPalindrome myString = new CheckIfStringIsPalindrome();

        boolean result = myString.checkIfPalindrome("taco cat");

        assertEquals(true, result);
    }

}
