public class Triangle extends Figure2D{
    private final Point2D base1;
    private final Point2D base2;
    private final Point2D height;

    public Triangle(Point2D base1, Point2D base2, Point2D height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    boolean includesPoint(Point2D point) {
        return false;
    }
}
