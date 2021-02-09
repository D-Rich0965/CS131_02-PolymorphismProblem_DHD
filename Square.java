
class Square extends Rectangle{

    private double side;
    Square(double side)
    {
        super(side,side);
        this.side=side;
        this.calculateArea();
    }
    public double getSide()
    {
        return this.side;
    }
    protected void calculateArea(){
        super.calculateArea();
    } 
    public double getArea(){
        return this.area;
    }
}
