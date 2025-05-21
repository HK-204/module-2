public class Test3D {
    public static void main(String[] args) {
        Point3D[] points = new Point3D[2];

        points[0] = new Point3D(0.5f,1.5f,0.8f);
        points[1] = new Point3D(1.8f,0.4f,0.5f);

        for (Point3D p : points) {
            System.out.println(p);
        }
    }
}
