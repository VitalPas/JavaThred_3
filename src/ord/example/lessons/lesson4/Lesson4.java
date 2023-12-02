package ord.example.lessons.lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        Human yuri = new Human("Yurich", 1992);
        System.out.println(yuri.name);
        System.out.println(yuri.yearOfBirth);
        yuri.handsUp();
        System.out.println("___________________________________________");

        Human human = new Human("Petr", 2000);
        System.out.println(human.name);
        System.out.println(human.yearOfBirth);
        human.handsUp();
        String info = human.getInfo();
        System.out.println(info);

        human.sum(30, 40);
        human.sum(30, 40, 50);
        human.sum("30", "40");

        System.out.println("___________________________________________");
        System.out.println(human.concat(1, 1));


    }
}
