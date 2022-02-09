package Main;

public class Lesson16 {

    public static void printCountOfDroppedOutPlayers(int speedOfPlayer1, int speedOfPlayer2, int speedOfPlayer3) {
        int countOfPlayers = 0;
        if (DroppedOutPlayerCalculator.isPlayerDroppedOut(speedOfPlayer1)) {
            ++countOfPlayers;

        }
        if (DroppedOutPlayerCalculator.isPlayerDroppedOut(speedOfPlayer2)) {
            ++countOfPlayers;
        }
        if (DroppedOutPlayerCalculator.isPlayerDroppedOut(speedOfPlayer3)) {
            ++countOfPlayers;
        }
        System.out.println("Количество выбывших игроков: " + countOfPlayers);
    }

    public static void main(String[] args) {

        DroppedOutPlayerCalculator.isGreenLight = false;

        printCountOfDroppedOutPlayers(1, 0, 2);

    }

}


//Оформите игру в виде отдельного класса, который бы в статическом поле хранил
//состояние светофора (включён ли красный свет или зелёный свет) и имел бы статический метод,
//принимащий параметром скорость и возвращающий ответ на вопрос,
//выбыл ли игрок с этой скоростью при текущем свете светофора.