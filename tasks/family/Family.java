package family;

import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {

        this.mother = mother;
        this.father = father;
        this.children = new Human[0];

        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    public void addChild(Human child) {
        Human[] updatedChildren = new Human[this.children.length + 1];

        // copying prev children to new arr
        for (int i = 0; i < this.children.length; i++) {
            updatedChildren[i] = this.children[i];
        }

        updatedChildren[updatedChildren.length - 1] = child;

        child.setFamily(this);

        this.setChildren(updatedChildren);
    }

    public boolean deleteChild(int childIndex) throws NoChildrenException{

        if (this.children.length == 0) throw new NoChildrenException("Невозмонжо удалить ребенка так как в семье нету детей.");

        Human foundChild = this.children[childIndex];
        foundChild.setFamily(null);

        if (this.children.length == 1) {
            Human[] updatedChildren = new Human[0];
            this.setChildren(updatedChildren);
            return true;
        }


        Human[] updatedChildren = new Human[this.children.length - 1];

        for (int i = 0; i < childIndex; i++) {
            updatedChildren[i] = this.children[i];
        }

        for (int i = childIndex + 1; i < this.children.length; i++) {
            updatedChildren[i - 1] = this.children[i];
        }

        this.setChildren(updatedChildren);

        return true;

    }
    public int countFamily() {
        // mother, father, pet
        return this.children.length + 3;
    }

    public void greetPet() {
        System.out.println("Привет, " + this.pet.getNickname());
    }

    public void describePet() {
        System.out.println("У меня есть " + this.pet.getSpecies().toString() + ", ему " + this.pet.getAge() + " лет" + " он " + this.pet.getTrickLevelDescription());
    }

    public void feedPet() {
        System.out.println("Спасибо, я кушаю...");
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

}
