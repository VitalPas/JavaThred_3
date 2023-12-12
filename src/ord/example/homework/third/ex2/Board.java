package ord.example.homework.third.ex2;

public class Board {
    private final String name;
    private final int length;
    private final int width;
    private final int height;

    public Board(String name, int length, int width, int height) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{"
                + "name='" + name + '\''
                + ", length=" + length
                + ", width=" + width
                + ", height=" + height
                + '}';
    }
}
