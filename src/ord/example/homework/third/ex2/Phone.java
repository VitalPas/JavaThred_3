package ord.example.homework.third.ex2;

public abstract class Phone {
    private String system;
    private Board board;
    private Camera camera;

    public Phone() {
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return  "system='" + system + '\''
                + ", board=" + board
                + ", camera=" + camera
                + '}';
    }
}
