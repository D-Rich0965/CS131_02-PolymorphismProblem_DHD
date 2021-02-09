
class Rectangle extends Shape{

    private double length;
    private double breadth;
    Rectangle(double length,double breadth)
    {
        super();
        this.length=length;
        this.breadth=breadth;
        this.calculateArea();
    }
    public double getBreadth()
    {
        return this.breadth;
    }
    public double getLength()
    {
        return this.length;
    }
    protected void calculateArea(){
        this.area = this.length * this.breadth;
    } 
    public double getArea(){
        return this.area;
    }
}

