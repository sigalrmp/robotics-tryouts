public class TaylerSinCos {

    public static void main(String[] args) {
        System.out.println("Sin approximation: " + TSin(0, 10));
        System.out.println("Cos approximation: " + TCos(0, 10));
    }

    public static double TSin(double x, int n) {
        return TSinH(x, n, 1, 1);
    }

    public static double TSinH(double x, int n, int i, int sign) {
        double val = sign * Math.pow(x, i) / Taylor.factorial(i);
        if (i >= n) {
            return val;
        }
        else { return val + TSinH(- x, n, i + 2, -sign); }
    }

    public static double TCos(double x, int n) {
        return TCosH(x, n, 0, 1);
    }

    public static double TCosH(double x, int n, int i, int sign) {
        double val = sign * Math.pow(x, i) / Taylor.factorial(i);
        if (i >= n) {
            return val;
        }
        else { return val + TCosH(x, n, i + 2, -sign); }
    }
}
