package ord.example.lessons.lesson8.ex1;

public class Worker {
    private Axe axe;

    public Worker(Axe axe) {
        this.axe = axe;
    }

    public void work() throws AxeBrokenException, WorkerWithoutAxeException {
        if (axe == null) {
            throw new WorkerWithoutAxeException("У работника топора");
        }
        axe.slash();
    }
}
