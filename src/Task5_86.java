public class Task5_86 {
/*
Составить программу возведения натурального числа в квадрат, учитывая
следующую закономерность:
    1^2 = 1
    2^2 = 1+3
    3^2 = 1+3+5
    n^2 = 1+...+2n-1
 */
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            System.out.println(2*(n+i)-1);
            sum+= 2*(n+i)-1;

        }
        System.out.println(sum);
    }
}
