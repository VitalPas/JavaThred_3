package ord.example.homework.third.ex1;

public abstract class ConiferousTree extends Tree {
    private final String needleType;

    public ConiferousTree(int age, String needleType) {
        super(age);
        this.needleType = needleType;
    }

    public String getNeedleType() {
        return needleType;
    }
}
