package ord.example.homework.four.ex1;

public abstract class Car {
    private boolean isClear;
    private int length;
    private int width;
    private double height;

    public Car(boolean isClear, int length, int width, double height) {
        this.isClear = isClear;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean getIsClear() {
        return isClear;
    }

    public void setClear(boolean clear) {
        isClear = clear;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
