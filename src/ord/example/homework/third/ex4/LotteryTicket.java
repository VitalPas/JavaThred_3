package ord.example.homework.third.ex4;

public class LotteryTicket {
    public static int winnings = 0;
    public static int numberOfTicket = 0;

    public LotteryTicket() {
        numberOfTicket++;
    }

    public void testLuck() {
        if (numberOfTicket % 10 == 0 && numberOfTicket % 100 == 0) {
            winnings += 5000;
        } else if (numberOfTicket % 10 == 0) {
            winnings += 100;
        }
    }
}
