package task17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedPlayersMethodsTest {

    @Test
    public void numberOfDropoutsWhenLightIsRed() {
        SpeedPlayersMethods.isGreenLight = false;

        int[] speedOfPlayer = {0, 3, 2,};
        int expected = 2;

        int actual = SpeedPlayersMethods.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWhenLightIsGreen() {
        SpeedPlayersMethods.isGreenLight = true;

        int[] speedOfPlayer = {0, 3, 2,};
        int expected = 0;

        int actual = SpeedPlayersMethods.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWhenL() {
        SpeedPlayersMethods.isGreenLight = false;

        int[] speedOfPlayer = {0, -3, 2,};
        int expected = 2;

        int actual = SpeedPlayersMethods.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void numberOfDropoutsWhenLightIs() {
        SpeedPlayersMethods.isGreenLight = true;

        int[] speedOfPlayer = {0, -3, 2,};
        int expected = 0;

        int actual = SpeedPlayersMethods.numberOfDropouts(speedOfPlayer);

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void dropoutRate() {
        int[] speedOfPlayer = {0, 3, 2,};
        SpeedPlayersMethods.isGreenLight = false;

        int[] expected = {3, 2};
        int[] actual = SpeedPlayersMethods.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void dropout() {
        int[] speedOfPlayer = {0, 3, 2,};
        SpeedPlayersMethods.isGreenLight = true;

        int[] expected = {};
        int[] actual = SpeedPlayersMethods.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void dropou() {
        int[] speedOfPlayer = {0, 3, -2,};
        SpeedPlayersMethods.isGreenLight = false;

        int[] expected = {3, -2};
        int[] actual = SpeedPlayersMethods.speedsOfDropped(speedOfPlayer);

        Assertions.assertArrayEquals(expected, actual);

    }
}





//            @Test
//            public void rateOfNonDropouts () {
//                int[] speedOfPlayer = {0, 3, 2,};
//
//                int expected = 0;
//                int actual = SpeedPlayersMethods.(speedOfPlayer);
//
//                Assertions.assertEquals(expected, actual);
//
//
//            }
//        }


