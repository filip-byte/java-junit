import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompassTest {
    Compass compass;
    @BeforeEach
    void setup(){
        compass = new Compass();
    }

    @Test
    @DisplayName("Returns direction when rotating RIGHT")
    void rotateRight() {

        // Act

        Compass.Point result1 = compass.rotate(Compass.Point.NORTH, Compass.Direction.RIGHT_TURN);
        Compass.Point result2 = compass.rotate(Compass.Point.EAST, Compass.Direction.RIGHT_TURN);
        Compass.Point result3 = compass.rotate(Compass.Point.WEST, Compass.Direction.RIGHT_TURN);
        Compass.Point result4 = compass.rotate(Compass.Point.SOUTH, Compass.Direction.RIGHT_TURN);

        // Assert

//        assertEquals(Compass.Point.EAST, result);
        assertAll(
                () -> assertEquals(Compass.Point.EAST, result1),
                () -> assertEquals(Compass.Point.SOUTH, result2),
                () -> assertEquals(Compass.Point.NORTH, result3),
                () -> assertEquals(Compass.Point.WEST, result4)
        );


    }

    @Test
    @DisplayName("Returns direction when rotating LEFT")
    void rotateLeft() {

        Compass.Point result1 = compass.rotate(Compass.Point.NORTH, Compass.Direction.LEFT_TURN);
        Compass.Point result2 = compass.rotate(Compass.Point.EAST, Compass.Direction.LEFT_TURN);
        Compass.Point result3 = compass.rotate(Compass.Point.WEST, Compass.Direction.LEFT_TURN);
        Compass.Point result4 = compass.rotate(Compass.Point.SOUTH, Compass.Direction.LEFT_TURN);

        assertAll(
                () -> assertEquals(Compass.Point.WEST, result1),
                () -> assertEquals(Compass.Point.NORTH, result2),
                () -> assertEquals(Compass.Point.SOUTH, result3),
                () -> assertEquals(Compass.Point.EAST, result4)
        );

    }

}