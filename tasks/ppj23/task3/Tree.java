package ppj23.task3;

public class Tree {

    private String name;
    private boolean hasFruit;

    public Tree(String name, boolean hasFruit) {
        this.name = name;
        this.hasFruit = hasFruit;
    }

    public void pickFruit() throws TreeWithoutFruitException {
        if (!this.hasFruit) throw new TreeWithoutFruitException(this.name + " has no fruits");
        else System.out.println("One fruit from " + this.name + " tree");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasFruit() {
        return hasFruit;
    }

    public void setHasFruit(boolean hasFruit) {
        this.hasFruit = hasFruit;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", hasFruit=" + hasFruit +
                '}';
    }
}
