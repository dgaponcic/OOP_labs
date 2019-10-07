package lab2;

public class Box {
    public float height = 1;
    public float width = 1;
    public float depth = 1;

    public Box() {
    }

    public Box(float input) {
        height = input;
        width = input;
        depth = input;
    }

    public Box(float height, float width, float depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    float getArea() {
        return 2 * (height * depth + depth * width + width * height);
    }

    float getVolume() {
        return height * width * depth;
    }
}