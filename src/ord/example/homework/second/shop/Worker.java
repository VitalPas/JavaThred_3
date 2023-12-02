package ord.example.homework.second.shop;

public class Worker {
    String name;
    int age;
    String gender;
    Item[] items;

    public Worker(String name, int age, String gender, Item[] items) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.items = items;
    }

    public void displayItem() {
        for (Item item : items) {
            System.out.println(name + ": " + "смотрите какая у меня вещь - " + item.nameProduct);
        }
    }

    public String displayItemsName() {
        StringBuilder itemsWorker = new StringBuilder();
        for (Item items : items) {
            itemsWorker.append(items.nameProduct).append(", ");
        }
        itemsWorker.deleteCharAt(itemsWorker.length()-2);
        return itemsWorker.toString();
    }
}
