package ord.example.homework.third.ex2;

public class Iphone extends Phone {
    private String telephoneModel;

    public Iphone(String telephoneModel) {
        this.telephoneModel = telephoneModel;
    }

    public String getTelephoneModel() {
        return telephoneModel;
    }

    public void setTelephoneModel(String telephoneModel) {
        this.telephoneModel = telephoneModel;
    }

    @Override
    public String toString() {
        return "Iphone {"
                + "telephoneModel='" + telephoneModel + '\''
                + ','
                + super.toString();
    }
}
