package ord.example.homework.third.ex5;

public class House {
    private String streetName;
    private int houseNumber;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public House(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public House() {
    }

    @Override
    public String toString() {
        return "House{"
                + "streetName='" + streetName + '\''
                + ", houseNumber=" + houseNumber
                + '}';
    }
}
