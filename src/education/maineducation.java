package education;

public class maineducation {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");

        int[] ratings = new int[5];

        ratings[0] = 1;
        ratings[1] = 3;
        ratings[2] = 1;
        ratings[3] = 5;
        ratings[4] = 5;

        for ( int i = 0; i < ratings.length; i++  ) {
            if (ratings[i] >=3){
                System.out.println(ratings[i]);
            }


        }


    }
}


        //ЦИКЛЫ:
        //int x = 0;
        //while (x < 10) {      //  while будет выполняться бесконечно, повторы
        //while (x < 100) {
        //while (true) {       //универсальный оператор цикла бесконечные цикл, но в условии может быть брейк и цикл прекратиться
            //x++;
            //if(x != 5);    //если х не равен 5, то выполняй условие
            //if (x==5){       //x равен 5, если всё плохо, то мы не будем делать, а передём к следующему условию, пропускаем повтор
            //continue;    // если это слово внутри цикла, то она завивает завершать текущею эпирацию, подход. Продолжить со след.эпирацией
            //Пропускает 5. Вниз уже не пойдём, прерывание
            //System.out.println("Hello, " + x + "!");
            //if (x == 10) {
                //break;  //означает заверши этот цикл не медленно, при цифре 10 завершит цикл. Но если дальше есть цикл он пойдёт дальше
            //Thread.sleep(300);
