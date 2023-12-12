
public class Fibonacci_numbers {
    public static void main(String[] args) {
        //1 2 3 4 5 6 7 8
        //0 1 1 2 3 5 8 13
        //мое решение
        int[] n = new int[21];
        for (int i = 0; i <n.length; i++) {
            n[i] = i;
            if (i>1) {
                n[i] = n[i-1]+n[i-2];
            }
            System.out.println(n[i]);
        }
        //найденное в интернете решение
//        int n1 = 1;
//        int n2 = 1;
//        int n3;
//        for (int i = 0; i < 15; i++) {
//            n3 = n1+n2;
//            n1 = n2;
//            n2 = n3;
//            System.out.println(n3);
//        }
    }
}
