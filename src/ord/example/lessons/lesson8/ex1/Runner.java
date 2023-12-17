package ord.example.lessons.lesson8.ex1;

public class Runner {
    public static void main(String[] args) throws Exception {
        Axe axe = new Axe();
        Worker worker = new Worker(null);
        Firm firm = new Firm(worker);
//        try {
//            firm.getMoney();
//        } catch (AxeBrokenException e) {
//            e.printStackTrace();
//            System.out.println("Чиним старый топор");
//        } catch (WorkerWithoutAxeException e) {
//            e.printStackTrace();
//            System.out.println("Выдаем новый топор работнику");
//        }

        try {
            firm.getMoney();
        } catch (AxeBrokenException | WorkerWithoutAxeException e) {
            System.out.println("Выдаем новый топор");
        }
        System.out.println("код дальше выполняется");

    }
}
