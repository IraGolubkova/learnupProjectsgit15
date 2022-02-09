package task17;

import Main.DroppedOutPlayerCalculator;

import java.util.Arrays;

public class Lesson17 {

    public static void main(String[] args) {
        DroppedOutPlayerCalculator.isGreenLight = false;

        int[] speedOfPlayer = new int[3];
        speedOfPlayer[0] = 0;
        speedOfPlayer[1] = 3;
        speedOfPlayer[2] = 2;


        int numberOfDropouts = SpeedPlayersMethods.numberOfDropouts(speedOfPlayer);

        System.out.println("Количество выбывших игроков " + numberOfDropouts);

        int[] speedsOfDropped = SpeedPlayersMethods.speedsOfDropped(speedOfPlayer);

        System.out.println("Скорость выбывающих " + Arrays.toString(speedsOfDropped));


        int[] speedsOfNotDropped = SpeedPlayersMethods.speedsOfNotDropped(speedOfPlayer);

        System.out.println("Скорость не выбывающих " + Arrays.toString(speedsOfNotDropped));

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