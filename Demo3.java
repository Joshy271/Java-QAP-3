public class Demo3 {
    public static void main(String[] args) {
     
        Point point = new Point(2.5f, 3.5f);
        System.out.println("Point:");
        System.out.println("Coordinates: " + point.toString());

        MovablePoint movablePoint = new MovablePoint(1.5f, 2.5f, 0.5f, 1.0f);
        System.out.println("\nMovable Point:");
        System.out.println("Initial Coordinates: " + movablePoint.toString());

        movablePoint.move();
        System.out.println("Coordinates after moving: " + movablePoint.toString());

        movablePoint.setXSpeed(2.0f);
        movablePoint.setYSpeed(3.0f);
        System.out.println("\nUpdated Coordinates: " + movablePoint.toString());

      
        movablePoint.setXY(4.0f, 5.0f);
        System.out.println("Coordinates after setting XY: " + movablePoint.toString());

        movablePoint.setSpeed(1.0f, 1.5f);
        System.out.println("Coordinates after setting Speed: " + movablePoint.toString());
    }
}
