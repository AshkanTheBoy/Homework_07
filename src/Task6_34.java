public class Task6_34 {
/*
Найти 15 первых натуральных чисел, делящихся нацело на 19 и находящихся
в интервале, левая граница которого равна 100.

 */
    public static void main(String[] args) {
        //прогоняем каждое число и увеличиваем счетчик при совпадении
        int count = 0;
        int number = 100;
        while (count<15) {
            if (number % 19 == 0) {
                ++count;
                System.out.println(number);
            }
            ++number;
        }

        System.out.println("__________________");

        //прогоняем до первого совпадения, затем увеличиваем на 15 numbersLeft-1 раз
        number = 100;
        int numbersLeft = 15;
        System.out.printf("Numbers left: %d", numbersLeft);
        System.out.println();
        while (number%19!=0) {
            ++number;
        }
        numbersLeft--;
        for (int i = 0; i < numbersLeft+1; i++) {
            System.out.printf("%d | Numbers left: %d", number, (numbersLeft-i));
            System.out.println();
            number+=19;

        }
    }
}
