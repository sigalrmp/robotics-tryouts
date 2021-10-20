public class Taylor {

    public static void main(String[] args) {
        System.out.println("eApprox: " + TaylorE(1, 10));
    }

    public static double TaylorE(double x, int n) {
        if (n == 0) {
            return 1;
        }
        else return Math.pow(x, n) / factorial(n) + TaylorE(x, n - 1);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        else return n * factorial(n - 1);
    }
}
