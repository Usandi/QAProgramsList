package OOPs;

abstract class AbstractShape {
    int noOfSides;
    double area;
    double perimeter;

    abstract void calculateArea();
    abstract void calculatePerimeter();
    abstract void setSides();
}
