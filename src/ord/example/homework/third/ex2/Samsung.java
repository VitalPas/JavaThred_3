package ord.example.homework.third.ex2;

public class Samsung extends Phone {
    private String telephoneModel;

    public String getTelephoneModel() {
        return telephoneModel;
    }

    public void setTelephoneModel(String telephoneModel) {
        this.telephoneModel = telephoneModel;
    }

    public Samsung(String telephoneModel) {

        this.telephoneModel = telephoneModel;
    }

    @Override
    public String toString() {
        return "Samsung {"
                + "telephoneModel='" + telephoneModel + '\''
                + ','
                + super.toString();
    }
}
