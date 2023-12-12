import java.util.Arrays;

public class Task5_75 {
    //найти сумму от 2^2 до 2^10 без операции возведения в степень
    public static void main(String[] args) {
        int n = 2;
        int product = n*n;
        int sum = product;

        for (int i = 2; i <= 10; i++) {
            System.out.printf("Product: %d  Sum: %d",product,sum);
            System.out.println();
            product *= n;
            sum += product;

        }

        //Решение через массивы
        n = 2;
        int len = 11;
        //len-2, чтобы убрать первые 2 индекса, иначе выводили бы [0][0][4]...
        int[] numbers = new int[len-2];
        sum = 0;
        for (int i=0; i< numbers.length; i++) {
            n*=2;
            numbers[i]  = n;
            System.out.println(Arrays.toString(numbers));
            sum+= numbers[i];
            System.out.println(sum);
        }





    }
}
