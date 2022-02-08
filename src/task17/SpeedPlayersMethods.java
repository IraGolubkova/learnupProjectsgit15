package task17;

import Main.DroppedOutPlayerCalculator;

public class SpeedPlayersMethods {

    public static int numberOfDropouts(int[] speedOfPlayer) {
        int countOfPlayers = 0;
        for (int i = 0; i != speedOfPlayer.length; ++i) {

            if (DroppedOutPlayerCalculator.isPlayerDroppedOut(speedOfPlayer[i])) {
                ++countOfPlayers;

            }

        }
        return countOfPlayers;
    }


    public static int[] speedsOfDropped(int[] speedOfPlayer) {

        int cnt = numberOfDropouts(speedOfPlayer);

        int[] result = new int[cnt];
        int resultCount = 0;
        for (int i = 0; i != speedOfPlayer.length; ++i) {

            if (DroppedOutPlayerCalculator.isPlayerDroppedOut(speedOfPlayer[i])) {
                result[resultCount] = speedOfPlayer[i];
                ++resultCount;


            }

        }
        return result;
    }


    public static int[] speedsOfNotDropped(int[] speedOfPlayer) {

        int cnt = speedOfPlayer.length - numberOfDropouts(speedOfPlayer);

        int[] result = new int[cnt];
        int resultCount = 0;
        for (int i = 0; i != speedOfPlayer.length; ++i) {

            if (DroppedOutPlayerCalculator.isPlayerDroppedOut(speedOfPlayer[i]) == false) {
                result[resultCount] = speedOfPlayer[i];
                ++resultCount;


            }

        }
        return result;
    }


}














