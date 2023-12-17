package ord.example.lessons.lesson8.ex1;

public class Firm {
    private Worker worker;

    public Firm(Worker worker) {
        this.worker = worker;
    }

    public void getMoney() throws Exception {
        worker.work();
    }

}
