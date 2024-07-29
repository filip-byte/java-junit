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


    }}
//    @Test
//    @DisplayName("Test Rotate RIGHT when facing WEST")
//    void rotateRightWhenFacingWest(){
//        Compass.Point result = compass.rotate(Compass.Point.WEST, Compass.Direction.RIGHT_TURN);
//
//        // Assert
//
//        assertEquals(Compass.Point.SOUTH, result);
//    }
//    @Test
//    @DisplayName("Test Rotate RIGHT when facing SOUTH")
//    void rotateRightWhenFacingSouth(){
//        Compass.Point result = compass.rotate(Compass.Point.SOUTH, Compass.Direction.RIGHT_TURN);
//
//        // Assert
//
//        assertEquals(Compass.Point.EAST, result);
//    }
//    @Test
//    @DisplayName("Test Rotate RIGHT when facing EAST")
//    void rotateRightWhenFacingEast(){
//        Compass.Point result = compass.rotate(Compass.Point.EAST, Compass.Direction.RIGHT_TURN);
//
//        assertEquals(Compass.Point.NORTH, result);
//    }
//}