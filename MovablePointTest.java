public class MovablePointTest {
    public static void main(String[] args) {
        Point point1 = new Point(3,6);
        System.out.println("Point : " + point1.toString());

        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setX(point1.getX());
        movablePoint.setY(point1.getY());
        movablePoint.setXSpeed(3);
        movablePoint.setYSpeed(2);
        movablePoint.move();
        System.out.println(movablePoint.toString());

    }
}