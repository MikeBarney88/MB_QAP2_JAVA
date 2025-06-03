class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Default constructor
    public MyRectangle() {
        this.topLeft = new MyPoint(0, 0);
        this.bottomRight = new MyPoint(1, 1);
    }

    // Constructor with points
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // Constructor with MyPoint objects
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    // Setters
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Get individual points
    public int getTopLeftX() {
        return topLeft.getX();
    }

    public int getTopLeftY() {
        return topLeft.getY();
    }

    public int getBottomRightX() {
        return bottomRight.getX();
    }

    public int getBottomRightY() {
        return bottomRight.getY();
    }

    // Set individual points
    public void setTopLeftX(int x) {
        topLeft.setX(x);
    }

    public void setTopLeftY(int y) {
        topLeft.setY(y);
    }

    public void setTopLeftXY(int x, int y) {
        topLeft.setXY(x, y);
    }

    public void setBottomRightX(int x) {
        bottomRight.setX(x);
    }

    public void setBottomRightY(int y) {
        bottomRight.setY(y);
    }

    public void setBottomRightXY(int x, int y) {
        bottomRight.setXY(x, y);
    }

    // Get width of rectangle
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Get height of rectangle
    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // Get area of rectangle
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Get perimeter of rectangle
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // toString method
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft.toString() +
                ",bottomRight=" + bottomRight.toString() + "]";
    }
}
