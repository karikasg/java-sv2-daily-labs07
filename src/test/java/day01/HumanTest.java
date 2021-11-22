package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    @Test
    void testHuman1() {
        Human human = new Human("Nagy Béla", 1978);
        assertEquals("Nagy Béla", human.getName());
        assertEquals(1978, human.getBirthYear());
    }

    void testHuman2() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human("Béla", 1878));
        assertEquals("Hibás adatok!", exception.getMessage());

    }


}