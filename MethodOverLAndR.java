package OOPs;

public class MethodOverLAndR extends AbstractShape{
    double length;
    double width;

    MethodOverLAndR(double l, double w) {
        this.length = l;
        this.width = w;
    }

    @Override
    void calculateArea() {
        area = length * width;
        System.out.println("The area is "+area);
    }
    //Method overloading
    void calculateArea(double h,double b) {
        area = (h * b)/2;
        System.out.println("Area of the triangle is "+area);
    }

    @Override
    void calculatePerimeter() {
        perimeter = 2*(length + width);
        System.out.println("The perimeter is "+perimeter);
    }

    @Override
    void setSides() {
        noOfSides = 4;
        System.out.println("This shape have "+noOfSides+" sides");
    }
    public static void main(String[] args) {
        MethodOverLAndR rectangle = new MethodOverLAndR(4,5);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        rectangle.setSides();
        rectangle.calculateArea(6,8);
    }
}
