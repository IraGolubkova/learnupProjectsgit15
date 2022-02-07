package education;

public class WebinarCode17 {

    public static int sum(int[] salaries) {
        int sum = 0;
        for (int salary : salaries) {
            sum += salary;
        }
        return sum;
    }

    public static int[] aboveAvg(int[] salaries) {
        int sum = sum(salaries);
        int avg = sum / salaries.length;

        int cnt = 0;
        for (int salary : salaries) {
            if (salary > avg) {
                cnt++;
            }
        }

        int[] bigSalaries = new int[cnt];
        int i = 0;
        for (int salary : salaries) {
            if (salary > avg) {
                bigSalaries[i] = salary;
                i++;
            }
        }

        return bigSalaries;
    }
}
