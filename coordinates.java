import javax.print.attribute.standard.MediaSize;
import java.awt.geom.Point2D;
import java.lang.Math;
import java.util.Scanner;

public class coordinates {

    public static void main(String[] args) {
        //problem 1
        double x = 1;
        double y = 1;
        //problem 2
        double DistanceToOrigin = DistanceToOrigin(x, y);
        System.out.println("Distance to origin: " + DistanceToOrigin);
        //problem 3
        double OtherX = 5;
        double OtherY = 3;
        //problem 4
        double r = DistanceToOrigin(OtherX, OtherY);
        double theta = Math.atan(OtherY / OtherX);
        System.out.println("r: " + r);
        System.out.println("theta: " + theta);
        //extra credit 1
        PolarToCartesian();
    }

    //problem 2 and 4
    public static double DistanceToOrigin(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    //extra credit 1
    public static void PolarToCartesian() {
        Scanner userCoodinates = new Scanner(System.in);
        System.out.println("Enter an r value");
        double r = Double.parseDouble(userCoodinates.nextLine());
        System.out.println("Enter a value for theta");
        double theta = Double.parseDouble(userCoodinates.nextLine());
        userCoodinates.close();
        double x = r * Math.cos(theta);
        double y = r * Math.sin(theta);
        printPoint(new Point2D.Double(x, y));
    }

    public static void printPoint(Point2D point) {
        System.out.println("(" + point.getX() + ", " + point.getY() + ")");
    }
}
