package ord.example.homework.second.shop;

public class Runner {
    public static void main(String[] args) {
        Item hammer = new Item(1000.0, "Молот");
        Item screwdriver = new Item(50.0, "Отвертка");
        Item notebook = new Item(30.0, "Тетрадь");
        Item pen = new Item(10.0, "Ручка");
        Worker vasiliy = new Worker("Василий", 30, "М", new Item[]{hammer, screwdriver});
        Worker maryana = new Worker("Марьяна", 25, "Ж", new Item[]{notebook, pen});
        Shop shop = new Shop(new Worker[]{vasiliy, maryana});

        shop.displayWorker();

        for (Worker workers : shop.workers) {
            workers.displayItems();
        }
    }
}
