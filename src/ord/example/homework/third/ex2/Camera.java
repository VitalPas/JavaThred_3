package ord.example.homework.third.ex2;

public class Camera {
    private final String model;
    private final String zoom;
    private final boolean flash;

    public Camera(String model, String zoom) {
        this.model = model;
        this.zoom = zoom;
        this.flash = false;
    }

    public Camera(String model, String zoom, boolean flash) {
        this.model = model;
        this.zoom = zoom;
        this.flash = flash;
    }

    public String getModel() {
        return model;
    }

    public String getZoom() {
        return zoom + "x zoom";
    }

    public boolean isFlash() {
        return flash;
    }

    @Override
    public String toString() {
        return "{"
                + "model='" + model + '\''
                + ", zoom='" + getZoom() + '\''
                + ", flash=" + flash
                + '}';
    }
}
