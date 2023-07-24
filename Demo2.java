public class Demo2 {
    public static void main(String[] args) {
        Shape s = new Shape("Red", true);
        Circle c = new Circle(5.0);
        Circle c1 = new Circle(5.0, "blue", true);
        Rectangle r = new Rectangle(2.0, 3.0);
        Rectangle r1 = new Rectangle(2.0, 3.0, "green", false);
        Square sq = new Square(4.0);
        Square sq1 = new Square(4.0, "yellow", true);

        System.out.println(" ");
        System.out.println(s.toString());
        System.out.println(" ");
        System.out.println(c.toString());
        System.out.println("Circle area: " + c.getArea());
        System.out.println("Circle perimeter: " + c.getPerimeter());
        System.out.println(" ");

        System.out.println(c1.toString());
        System.out.println("Circle 1 area: " + c1.getArea());
        System.out.println("Circle 1 perimeter: " + c1.getPerimeter());
        System.out.println(" ");

        System.out.println(r.toString());
        System.out.println("Rectangle area: " + r.getArea());
        System.out.println("Rectangle perimeter: " + r.getPerimeter());
        System.out.println(" ");

        System.out.println(r1.toString());
        System.out.println("Rectangle 1 area: " + r1.getArea());
        System.out.println("Rectangle 1 perimeter: " + r1.getPerimeter());
        System.out.println(" ");

        System.out.println(sq.toString());
        System.out.println("Square area: " + sq.getArea());
        System.out.println("Square perimeter: " + sq.getPerimeter());
        System.out.println(" ");

        System.out.println(sq1.toString());
        System.out.println("Square 1 area: " + sq1.getArea());
        System.out.println("Square 1 perimeter: " + sq1.getPerimeter());
    }
}

