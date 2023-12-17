package ord.example.lessons.lesson7.ex2;

public abstract class Camera {
    public int zoom;

    public Camera(int zoom) {
        this.zoom = zoom;
    }

    public int getZoom() {
        return zoom;
    }
}
