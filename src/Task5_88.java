public class Task5_88 {
/*
5.88
Составить программу возведения натурального числа в третью степень, учитывая следующую закономерность:
1^3 = 1
2^3 = 3+5
3^3 = 7+9+11
...
 */
    public static void main(String[] args) {
        //переменные: постоянная 1, разница от первой, куб(общая сумма чисел), диапазон
        int start = 1;
        int diffFromStart = 0;
        int cube;
        int number = 11;

        //цикл возведения в куб каждого числа в диапазоне 1...(number+1)
        for (int nToCube = 1; nToCube < number+1; nToCube++) {
            cube = 0;
            System.out.print(0);
            //цикл суммирования для выведения куба данного числа
            for (int i = 0; i < nToCube; i++) {
                cube+= start+diffFromStart;

                System.out.print(" + "+(start+diffFromStart));
                diffFromStart+=2;
            }

            System.out.println(" | "+cube);
        }
    }
}
