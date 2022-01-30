class Main {
    public static void main(String[] args) {
        boolean isGreenLight = true;

        int speedOfPlayer1 = 0;
        int speedOfPlayer2 = 1;
        int speedOfPlayer3 = 0;

        // Допишите здесь логику так, что будет подсчитано и выведено
        // количество игроков, которые выбывают.
        // Если свет зелёный, то проходят все игроки (0 выбывают).
        // Если свет красный, то выбывает каждый, чья скорость не 0.

        int countOfPlayers = 0;
        if (isGreenLight == true) {

            if (speedOfPlayer1 != 0) {
                countOfPlayers = countOfPlayers + 1;
            }

            if (speedOfPlayer2 != 0) {
                countOfPlayers = countOfPlayers + 1;
            }

            if (speedOfPlayer3 != 0) {
                countOfPlayers = countOfPlayers + 1;
            }

        }
        System.out.println("Количество выбывших игроков: " + countOfPlayers );
    }
}



