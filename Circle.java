
class Circle extends Shape{
   
    private double radius;
    Circle(double radius)
    {
        super();
        this.radius=radius;
        this.calculateArea();
    }
    public double getRadius()
    {
        return this.radius;
    }
    protected void calculateArea(){
        this.area = 3.14 * radius * radius;
    } 
    public double getArea(){
        return this.area;
    }
}
