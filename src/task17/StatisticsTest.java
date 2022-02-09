package task17;

import Main.DroppedOutPlayerCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsTest {

    @Test
    public void testingPlayers() {
        DroppedOutPlayerCalculator.isGreenLight = false;

        int[] speedOfPlayer = {0, 3, 2,};
        int expected = 2;


        int actual =  DroppedOutPlayerCalculator.isPlayerDroppedOut(speedOfPlayer); {

        Assertions.assertEquals(expected, false);


        }


        @Test
        public void dropoutRate() {
            int[] speedOfPlayer = {0, 3, 2,};

            int[] expected = {3, 2};
            int[] actual = DroppedOutPlayerCalculator.isPlayerDroppedOut(speedOfPlayer); {

            Assertions.assertEquals(expected, actual);

            }

            @Test
            public void rateOfNonDropouts () {
                int[] speedOfPlayer = {0, 3, 2,};

                int expected = 0;
                int actual = DroppedOutPlayerCalculator.isPlayerDroppedOut(speedOfPlayer);

                Assertions.assertEquals(expected, actual);


            }
        }


