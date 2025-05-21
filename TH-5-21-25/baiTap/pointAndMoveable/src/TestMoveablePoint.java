public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        MoveablePoint[] moveablePoints = new MoveablePoint[2];
        moveablePoints[0] = new MoveablePoint(10.5f, 15.5f);
        moveablePoints[1] = new MoveablePoint(9.5f, 8.5f);
        for (MoveablePoint m : moveablePoints) {
            System.out.println(m);
        }

        MoveablePoint moveablePoint1 = new MoveablePoint(10.5f, 15.5f, 5.5f, 3.8f);
        System.out.println(moveablePoint1);
    }
}
