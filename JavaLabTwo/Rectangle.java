package labtwo;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.length=length;
        this.width=width;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }
}
