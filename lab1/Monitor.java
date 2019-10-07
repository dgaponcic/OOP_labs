package lab1;

public class Monitor {
    public String color;
    public String dimensions;
    public String resolution;

    public Monitor(String color, String dimensions, String resolution) {
        this.color = color;
        this.dimensions = dimensions;
        this.resolution = resolution;
    }

    public boolean compare(Monitor monitor2) {
        if (!this.color.equals(monitor2.color)) {
            return false;
        }
        if (!this.dimensions.equals(monitor2.dimensions)) {
            return false;
        }
        return this.resolution.equals(monitor2.resolution);
    }
}
