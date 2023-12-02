package ord.example.homework.second.office;

public class Runner {
    public static void main(String[] args) {
        Boss petr = new Boss("Петр Николаевич");
        Manager volodya = new Manager("Володя");
        Security petrovich = new Security("Петрович");
        Secretary secretary = new Secretary();

        Office office = new Office(petr, volodya, secretary, petrovich);

        office.workDay();
    }
}
