package ord.example.homework.second.shop;

public class Shop {
    Worker[] workers;

    public Shop(Worker[] workers) {
        this.workers = workers;
    }

    public void displayWorker() {
        for (Worker worker : workers) {
            System.out.println(worker.name + ": " + worker.age + ", " + worker.gender + " список вещей: "
                    + worker.displayItemsName());
        }
    }
}
