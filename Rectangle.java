class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public void displayInfo() {
        System.out.println("Rectangle Width: " + width + ", Height: " + height);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 10.0);
        Rectangle rect2 = new Rectangle(7.5, 3.5);

        rect1.displayInfo();
        rect2.displayInfo();
    }
}
