package ord.example.homework.third.ex1;

public class Birch extends DeciduousTree {
    public Birch(int age, boolean leavesOnTree) {
        super(age, leavesOnTree);
    }

    @Override
    public void fallenLeaves() {
        super.fallenLeaves();
    }

    @Override
    public void bloomedLeaves() {
        super.bloomedLeaves();
        System.out.println("Источает аллергены");
    }
}
