public class OriginAndDestination {
    private Place origin;
    private Place destination;

    public OriginAndDestination(Place origin, Place destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public Place getOrigin() {
        return origin;
    }

    public Place getDestination() {
        return destination;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof OriginAndDestination)){
            return false;
        }
        return ((OriginAndDestination) obj).getOrigin().equals(origin) && ((OriginAndDestination) obj).getDestination().equals(destination);
    }
}
