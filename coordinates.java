//import math

public class coordinates {

    public static float x;
    public static float y;
    public static float DistanceToOrigin;
    public static float OtherX;
    public static float OtherY;
    public static Point2D.Float OtherPolar; 

    public static void main(String[] args) {
        x = 1;
        y = 1;
        OtherX = 5
        OtherY = 3;
        DistanceToOrigin = DistanceToOrigin(x, y);
        System.out.println(DistanceToOrigin);
        OtherPolar = CartesianToPolar(OtherX, OtherY);
        System.out.println("r: " + OtherPolar.x);
        System.out.println("theta: " + OtherPolar.y);

        
    }

    public static float DistanceToOrigin(float x, float y) {
       Math.pow(x^2) - Math.pow(y^2);
    }

    public static Point2D.Float CartesianToPolar(float x, float y) {
        float r = sqrt(Math.pow(x^2) + Math.pow(y^2));
        float theta = atan(y / x);
        Point2D.Float point = new Point2D(r, theta);
        return point;
    }

    public static Point2.Float PolatToCartesian(float r float theta) {
    }
}