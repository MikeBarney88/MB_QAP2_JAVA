public class TestMyLine {
    public static void main(String[] args) {
        System.out.println("Testing MyPoint Class");

        // Test MyPoint constructors
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(3, 4);
        System.out.println("Default point: " + p1);
        System.out.println("Point (3,4): " + p2);

        // Test MyPoint getters and setters
        System.out.println("p2.getX(): " + p2.getX());
        System.out.println("p2.getY(): " + p2.getY());

        p1.setX(1);
        p1.setY(2);
        System.out.println("After setting p1 to (1,2): " + p1);

        p1.setXY(5, 6);
        System.out.println("After setting p1 to (5,6): " + p1);

        // Test distance
        System.out.println("Distance from p1 to p2: " + p1.distance(p2));
        System.out.println("Distance from p1 to origin: " + p1.distance());

        System.out.println("\nTesting MyLine Class");

        // Test MyLine constructors
        MyLine line1 = new MyLine(p1, p2);
        MyLine line2 = new MyLine(0, 0, 3, 4);

        System.out.println("Line1 (using MyPoint objects): " + line1);
        System.out.println("Line2 (using points): " + line2);

        // Test getters and setters
        System.out.println("Line1 begin point: " + line1.getBegin());
        System.out.println("Line1 end point: " + line1.getEnd());
        System.out.println("Line1 begin X: " + line1.getBeginX());
        System.out.println("Line1 begin Y: " + line1.getBeginY());
        System.out.println("Line1 end X: " + line1.getEndX());
        System.out.println("Line1 end Y: " + line1.getEndY());

        line1.setBeginX(5);
        line1.setBeginY(10);
        System.out.println("After setting begin to (5,10): " + line1);

        line1.setEndXY(15, 20);
        System.out.println("After setting end to (15,20): " + line1);

        MyPoint newBegin = new MyPoint(1, 1);
        MyPoint newEnd = new MyPoint(5, 5);
        line1.setBegin(newBegin);
        line1.setEnd(newEnd);
        System.out.println("After setting new begin and end points: " + line1);

        // Test point array methods
        int[] beginPoints = line1.getBeginXY();
        int[] endPoints = line1.getEndXY();
        System.out.println("Begin points: [" + beginPoints[0] + "," + beginPoints[1] + "]");
        System.out.println("End points: [" + endPoints[0] + "," + endPoints[1] + "]");

        // Test length and gradient
        System.out.println("Length of line1: " + String.format("%.2f", line1.getLength()));
        System.out.println("Gradient of line1 (radians): " + String.format("%.4f", line1.getGradient()));
        System.out.println("Length of line2: " + String.format("%.2f", line2.getLength()));
        System.out.println("Gradient of line2 (radians): " + String.format("%.4f", line2.getGradient()));
    }
}
