public class Place {
    private String name;

    public Place(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Place)){
            return false;
        }
        return ((Place) obj).getName().equals(name);
    }
}
