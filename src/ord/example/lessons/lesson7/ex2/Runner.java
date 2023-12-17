package ord.example.lessons.lesson7.ex2;

public class Runner {
    public static void main(String[] args) {
        CheapCamera cheapCamera = new CheapCamera();
        ExpensiveCamera expensiveCamera = new ExpensiveCamera();
        PhoneWithCheapCamera phoneWithCheapCamera = new PhoneWithCheapCamera(cheapCamera);
        PhoneWithExpensiveCamera phoneWithExpensiveCamera = new PhoneWithExpensiveCamera(expensiveCamera);
        Phone phone = new Phone(cheapCamera);
        if (phone.getCamera() instanceof ExpensiveCamera) {
            ((ExpensiveCamera) phone.getCamera()).makeShot();
        }



    }
}
