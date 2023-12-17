package ord.example.lessons.singleton;

public class Runner {
    public static void main(String[] args) {
        System.out.println(Sun.getOrCreateSun());
        System.out.println(Sun.getOrCreateSun());
        System.out.println(Sun.getOrCreateSun());
        System.out.println(Sun.getOrCreateSun());
        System.out.println(Sun.getOrCreateSun());
    }
}
