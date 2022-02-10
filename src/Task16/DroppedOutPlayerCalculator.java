package Task16;

public class DroppedOutPlayerCalculator {
    public static boolean isGreenLight = false;

    public static boolean isPlayerDroppedOut(int speedOfPlayer) {
        //return isGreenLight == false && speedOfPlayer != 0;
        if (isGreenLight == false) {
            if (speedOfPlayer != 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
