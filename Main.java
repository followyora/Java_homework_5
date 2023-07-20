public class Main {

    public static void main(String[] args) {
        System.out.println("****** №1 Numbers ******");
        System.out.println();
        comparison(10.65, 10.5, 10);
        System.out.println();
        System.out.println("______ №2 Work hours ______");
        System.out.println();
        calculate(2000);


    }

    public static void comparison(double a, double b, double c) {
        if (Math.abs(a - c) < Math.abs(b - c)) System.out.println("a is closer to " + c + " then b");
        else if (Math.abs(a - c) > Math.abs(b - c)) System.out.println("b is closer to " + c + " then a");
        else System.out.println("they're even");


    }

    public static void calculate(int seconds) {
        int hours = seconds / 3600;
        if (hours >= 8) System.out.println("Это больше чем полный рабочий день");
        else if (hours >= 5) System.out.println("Осталось " + seconds / 3600 + " часов");
        else if (hours < 5 && hours >= 2) System.out.println("Осталось " + seconds / 3600 + " часа");
        else if (hours < 2 && hours >= 1) System.out.println("Остался 1 час");
        else if (hours < 1 && hours >= 0) System.out.println("Осталось меньше одного часа");
        else System.out.println("Число должно быть положительным");
    }
}






