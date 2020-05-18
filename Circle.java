package OOPs;

public class Circle extends AbstractShape implements ShapeConstants{
    double radius;

    Circle(double radius1) {
        this.radius = radius1;
    }
    @Override
    void calculateArea() {
        area = ShapeConstants.pi * Math.pow(radius,2);
        System.out.println("Area of the circle is "+area);
    }

    @Override
    void calculatePerimeter() {
        perimeter = 2 * ShapeConstants.pi * radius;
        System.out.println("Perimeter of the circle is "+perimeter);
    }

    @Override
    void setSides() {
        noOfSides = 0;
        System.out.println("This shape have "+ noOfSides + " sides");
    }
    public static void main(String[] args) {
     Circle c = new Circle(2.2);
     c.calculateArea();
     c.calculatePerimeter();
     c.setSides();
    }
}
