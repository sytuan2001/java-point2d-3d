public class test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(2, 2);
        System.out.println(point2D);

        float[] xy = point2D.getXY();
        System.out.println(xy[0] + "y = " + xy[1]);

        Point3D point3D = new Point3D(3.5f, 1.5f, 2.5f);
        System.out.println(point3D);
    }
}
