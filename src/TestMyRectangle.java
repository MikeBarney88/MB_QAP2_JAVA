public class TestMyRectangle {
    public static void main(String[] args) {
        System.out.println("Test MyRectangle Class");

        // Test default constructor
        MyRectangle r1 = new MyRectangle();

        System.out.println("Default rectangle: " + r1);
        System.out.println("Width: " + r1.getWidth() + ", Height: " + r1.getHeight());
        System.out.println("Area: " + r1.getArea() + ", Perimeter: " + r1.getPerimeter());

        // Test constructor with points
        MyRectangle r2 = new MyRectangle(1, 1, 5, 4);

        System.out.println("\nRectangle with coordinates (1,1) to (5,4): " + r2);
        System.out.println("Width: " + r2.getWidth() + ", Height: " + r2.getHeight());
        System.out.println("Area: " + r2.getArea() + ", Perimeter: " + r2.getPerimeter());

        // Test constructor with MyPoint objects
        MyPoint topLeft = new MyPoint(2, 2);
        MyPoint bottomRight = new MyPoint(8, 6);
        MyRectangle r3 = new MyRectangle(topLeft, bottomRight);

        System.out.println("\nRectangle with MyPoint objects: " + r3);
        System.out.println("Width: " + r3.getWidth() + ", Height: " + r3.getHeight());
        System.out.println("Area: " + r3.getArea() + ", Perimeter: " + r3.getPerimeter());

        // Test getters
        System.out.println("\nTest Getters");
        System.out.println("rect2 top-left: " + r2.getTopLeft());
        System.out.println("rect2 bottom-right: " + r2.getBottomRight());
        System.out.println("rect2 top-left X: " + r2.getTopLeftX());
        System.out.println("rect2 top-left Y: " + r2.getTopLeftY());
        System.out.println("rect2 bottom-right X: " + r2.getBottomRightX());
        System.out.println("rect2 bottom-right Y: " + r2.getBottomRightY());

        // Test setters
        System.out.println("\nTest Setters");
        r2.setTopLeftX(0);
        r2.setTopLeftY(0);
        System.out.println("After setting top-left to (0,0): " + r2);

        r2.setBottomRightXY(6, 3);
        System.out.println("After setting bottom-right to (6,3): " + r2);

        MyPoint newTopLeft = new MyPoint(1, 1);
        MyPoint newBottomRight = new MyPoint(4, 4);
        r2.setTopLeft(newTopLeft);
        r2.setBottomRight(newBottomRight);
        System.out.println("After setting new corner points: " + r2);
    }
}