package task17;

public class main17 {

    public static void main(String[] args) {
        boolean isGreenLight = false;

        int[] speedOfPlayer1 = new int[3];
        speedOfPlayer1[0] = 0;
        speedOfPlayer1[1] = 1;
        speedOfPlayer1[2] = 2;


        int countOfPlayers1 = 0;
        if (isGreenLight == false) {

            if (speedOfPlayer1[0] != 0) {
                ++countOfPlayers1;
            }

            if (speedOfPlayer1[1] != 0) {
                ++countOfPlayers1;
            }

            if (speedOfPlayer1[2] != 0) {
                ++countOfPlayers1;
            }

        }
        System.out.println("Количество выбывших игроков: " + countOfPlayers1);


        int[] speedOfPlayer2 = new int[3];
        speedOfPlayer2[0] = 0;
        speedOfPlayer2[1] = 1;
        speedOfPlayer2[2] = 2;

        System.out.println("Скорость выбывающих");

        for (int countOfPlayers2 = 0; countOfPlayers2 < speedOfPlayer2.length; ++countOfPlayers2) {
            if (speedOfPlayer2[countOfPlayers2] != 0) {
                System.out.println(speedOfPlayer2[countOfPlayers2]);



                //int[] speedOfPlayer3 = new int[3];
                //speedOfPlayer3[0] = 0;
                //speedOfPlayer3[1] = 1;
                //speedOfPlayer3[2] = 2;

                //System.out.println("Скорость не выбывающих");


                // for (int countOfPlayers3 = 0; countOfPlayers3 < speedOfPlayer3.length; ++countOfPlayers3) {

                //}
                //for (int speedOfPlayer2 : speedOfPlayer3) {
                // if (speedOfPlayer3[nonRetiringPlayer] == 1) {
                // System.out.println(speedOfPlayer3[nonRetiringPlayer]);


            }
        }
    }
}


//Теперь мы нашему классу можем в параметре метода передавать информацию о скорости не одного человека,
// нескольких сразу, упаковав все скорости в массив.
// Создайте в этом классе три метода, каждый из которых принимал бы массив скоростей и возвращал бы:
//i) первый метод - количество выбывающих;
//ii) второй метод - массив из скоростей выбывающих (в том же порядке, что и в исходном массива)
//iii) третий метод - массив из скоростей не выбывающих (в том же порядке, что и в исходном массива).
//Для второго и третьего методов сперва посчитайте размер ответа,
//затем создайте массив ответа и заполните его.
//Не забудьте написать тесты на эти методы.
//Мавен-координаты библиотеки для идеи: org.junit.jupiter:junit-jupiter:5.4.2