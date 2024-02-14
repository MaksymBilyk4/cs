package family;

public class Main {

    public static void main(String[] args) {
        String[] habits = {"Спать", "Кушать"};
        Human father = new Human("Andrii", "Bilyk", 1981);
        Human mother = new Human("Tetiana", "Bilyk", 1980);
        Pet pet = new Pet("Marsik", 7, PetType.CAT, 99, habits);

        Family family = new Family(mother, father);
        family.setPet(pet);

        System.out.println(family);
    }

}
