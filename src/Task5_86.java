public class Task5_86 {
/*
5.86
Составить программу возведения натурального числа в квадрат, учитывая
следующую закономерность:
    1^2 = 1
    2^2 = 1+3
    3^2 = 1+3+5
    n^2 = 1+...+2n-1

5.87
Найти сумму от 1^2 до 10^2, учитывая закономерность
 */
    public static void main(String[] args) {
        int n = 1;
        int square;
        int numberToPow = 3;
        int sumOfSquares = 0;
        int number = numberToPow;

        //цикл диапазона
        for (int j = 0; j < number; j++) {
            System.out.println((j+1)+"^2");
            square = 0;

            //цикл конкретного числа
            for (int i = 0; i < j+1; i++) {
                System.out.print((2*(n+i)-1)+" ");
                square+= 2*(n+i)-1;
            }

            sumOfSquares+= square;
            System.out.printf("| %d | The sum is: %d",square, sumOfSquares);
            System.out.println();
            numberToPow--;
        }
    }
}
