import java.lang.Math;
import java.util.Scanner;

public class CoordArray {

    static double[][] points = {{0, 0}, {3, 4}, {-6, 44}, {-11, 32}, {-18, 8}, {17, 20}, {-31, 75}, {-27, 74.5}, {-6, 54.5}, {6, 51}};

    public static void main(String[] args) {

        System.out.println("distance between points 4 and 7 :" + DistBtwnPoints(points[3], points[6]));
        System.out.println("distance along the path from start to end" + DistAlongPoints(0, points.length - 1));
        DistInputAB();
    }

    public static double DistBtwnPoints(double point1[], double point2[]) {
        return Math.sqrt(Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2));
    }

   // public static double TotalDistAlong(double[][] points) {
     //   double dist = 0;
       // for (int point = 0; point < 9; point ++) {
         //   dist += DistBtwnPoints(points[point], points[point + 1]);
      //  }
    // return dist;
    //}

    public static double DistAlongPoints(int start, int end) {
        double dist = 0;
        for (int point = start; point < end; point ++) {
            dist += DistBtwnPoints(points[point], points[point + 1]);
        }
        return dist;
    }

    public static boolean indexInArray(int i) {
        return 0 <= i && i < points.length;
    }

    public static double DistInputAB() {
        Scanner userAB = new Scanner(System.in);
        System.out.println("Enter a start value");
        int start = Integer.parseInt(userAB.nextLine()) - 1;
        System.out.println("Enter an end value");
        int end = Integer.parseInt(userAB.nextLine()) - 1;
        if (! indexInArray(start)) {
            start = 0;
        }
        if (! indexInArray(end)) {
            end = points.length - 1;
        }
        if (start >= end) {
            start = end - 1;
        }
        return DistAlongPoints(start, end);
    }
}