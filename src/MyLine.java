class MyLine {
    private MyPoint begin;
    private MyPoint end;

    // Constructor MyPoint
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Constructor
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    // Getters
    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    // Setters
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Get begin points
    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    // Get end points
    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    // Set begin points
    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    // Set end points
    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // Get length
    public double getLength() {
        return begin.distance(end);
    }

    // Get gradient
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    // Get begin points as array
    public int[] getBeginXY() {
        return new int[] {begin.getX(), begin.getY()};
    }

    // Get end points as array
    public int[] getEndXY() {
        return new int[] {end.getX(), end.getY()};
    }

    // toString
    public String toString() {
        return "MyLine[begin=" + begin.toString() + ",end=" + end.toString() + "]";
    }
}
