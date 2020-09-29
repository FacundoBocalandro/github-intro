public class Rectangle extends Figure2D{
    private Point2D vertex1;
    private Point2D vertex2;

    public Rectangle(Point2D vertex1, Point2D vertex2) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
    }

    @Override
    boolean includesPoint(Point2D point) {
        return PointComparator.isContainedX(point, vertex1, vertex2) && PointComparator.isContainedY(point, vertex1, vertex2);
    }
}
