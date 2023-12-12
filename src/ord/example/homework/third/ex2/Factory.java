package ord.example.homework.third.ex2;

public class Factory {

    public Factory() {
    }

    public void createPhone(Iphone iphone) {
        iphone.setSystem("Ios");
        iphone.setBoard(new Board("7uik", 12, 15, 13));
        iphone.setCamera(new Camera("iphone", "15", true));
    }

    public void createPhone(Samsung samsung) {
        samsung.setSystem("Android");
        samsung.setBoard(new Board("j-108", 12, 10, 13));
        samsung.setCamera(new Camera("Samsung", "20"));
    }
}
