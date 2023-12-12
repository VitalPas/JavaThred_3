package ord.example.homework.third.ex5;

import java.util.Arrays;

public final class City {
    private final String cityName;
    private final House[] houses;

    public String getCityName() {
        return cityName;
    }

    public House[] getHouses() {
        House[] copyHouse = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            copyHouse[i] = new House();
            copyHouse[i].setHouseNumber(houses[i].getHouseNumber());
            copyHouse[i].setStreetName(houses[i].getStreetName());
        }
        return copyHouse;
    }

    public City(String cityName, House[] houses) {
        this.cityName = cityName;
        this.houses = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            this.houses[i] = new House();
            this.houses[i].setStreetName(houses[i].getStreetName());
            this.houses[i].setHouseNumber(houses[i].getHouseNumber());
        }
    }

    @Override
    public String toString() {
        return "City{"
                + "cityName='" + cityName + '\''
                + ", houses=" + Arrays.toString(houses)
                + '}';
    }
}
