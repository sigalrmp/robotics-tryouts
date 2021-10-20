import java.lang.Math;

public class CoordArray {

    static double[][] points = {{0, 0}, {3, 4}, {-6, 44}, {-11, 32}, {-18, 8}, {17, 20}, {-31, 75}, {-27, 74.5}, {-6, 54.5}, {6, 51}};

    public static void main(String[] args) {

        System.out.println(DistBtwnPoints(points[3], points[6]));
    }

    public static double DistBtwnPoints(double point1[], double point2[]) {
        return Math.sqrt(Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2));
    }

    public double TotalDist(double[][] points) {
        double dist = 0;
        for (int point = 0; point < 9; point ++) {
            dist += DistBtwnPoints(points[point], points[point + 1]);
        }
        return dist;
    }
}