public class swapNumber {
    public static void main(String[] args) {

        swapNumber(5, 10);
    }

    public static void swapNumber(int a, int b) {
        System.out.println("num1 :" + a + ", num2 :" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("num1 :" + a + ", num2 :" + b);

    }
}
