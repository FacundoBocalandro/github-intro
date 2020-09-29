public class Circle extends Figure2D{
    private final Point2D center;
    private final double radius;

    public Circle(Point2D center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    boolean includesPoint(Point2D point) {
        return PointComparator.distance(point, center) <= radius;
    }
}
