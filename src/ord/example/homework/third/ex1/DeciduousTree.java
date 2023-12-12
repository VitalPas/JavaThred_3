package ord.example.homework.third.ex1;

public abstract class DeciduousTree extends Tree {
    private boolean leavesOnTree;

    public boolean isLeavesOnTree() {
        return leavesOnTree;
    }

    public void setLeavesOnTree(boolean leavesOnTree) {
        this.leavesOnTree = leavesOnTree;
    }

    public DeciduousTree(int age, boolean leavesOnTree) {
        super(age);
        this.leavesOnTree = leavesOnTree;
    }

    public void fallenLeaves() {
        this.leavesOnTree = false;
    }

    public void bloomedLeaves() {
        this.leavesOnTree = true;
    }
}
