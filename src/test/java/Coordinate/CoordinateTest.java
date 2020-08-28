package Coordinate;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinateTest {
    @Test
    public void toString_A1_test() {
        Coordinate coordinate = new Coordinate(0, 0);

        String expected = "A1";

        String actual = coordinate.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void toString_A8_test() {
        Coordinate coordinate = new Coordinate(0, 7);

        String expected = "A8";

        String actual = coordinate.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void toString_H1_test() {
        Coordinate coordinate = new Coordinate(7, 0);

        String expected = "H1";

        String actual = coordinate.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void toString_H8_test() {
        Coordinate coordinate = new Coordinate(7, 7);

        String expected = "H8";

        String actual = coordinate.toString();
        assertEquals(expected, actual);
    }
}