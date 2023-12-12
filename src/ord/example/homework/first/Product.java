package ord.example.homework.first;

public enum Product {
    SAUSAGE(800), HAM(350), NECK(500);
    private int price;

    Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
