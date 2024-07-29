import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComapssTest {

    @Test
    @DisplayName("Returns East when facing North and passed TURN_RIGHT")

    void rotateRotatingRight() {

        // Arrange
        Comapss comapss = new Comapss();

        // Act
        Comapss.Point result = comapss.rotate(Comapss.Point.NORTH, Comapss.Direction.RIGHT_TURN);

        // Assert

        assertEquals(Comapss.Point.EAST, result);


    }
}