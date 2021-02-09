
class ShapeApp{
    public static void main (String[] args) {
        Circle circle = new Circle(2);
        System.out.println("Circle's area : "+circle.getArea());
        Square square = new Square(9);
        System.out.println("Square's area : "+square.getArea());
        Rectangle rectangle = new Rectangle(6,8);
        System.out.println("Rectangle's area : "+rectangle.getArea());
    }
}