package Homework3;

public class Shapes {
    public static void main(String[] args) {
        GeometricFigure[] shapes = {new Circle(3), new Triangle(4, 5), new Square(2)};
        double totalArea = calculateTotalArea(shapes);
        System.out.println("Total area of all shapes: " + totalArea);
    }

    public static double calculateTotalArea(GeometricFigure[] shapes) {
        double totalArea = 0;
        for (GeometricFigure shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}

