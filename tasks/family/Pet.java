package family;

import java.util.Arrays;
import java.util.Objects;

public class Pet {

    private String nickname;

    private int age;

    private PetType species;

    private int trickLevel;

    private String[] habits;


    public Pet(PetType petType, String nickname) {
        this.nickname = nickname;
        this.species = petType;
    }

    public Pet(String nickname, int age, PetType species, int trickLevel, String[] habits) {
        this.nickname = nickname;
        this.age = age;
        this.species = species;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {}



    public void eat() {
        System.out.println("Я кушаю!");
    }

    public void foul() {
        System.out.println("Нужно хорошо замести следы...");
    }

    public void respond() {
        System.out.println("Привет, хозяин. Я - " + this.nickname + ". Я соскучился!");
    }

    public String getTrickLevelDescription() {
        return this.trickLevel > 50 ? "очень хитрый" : "почти не хитрый";
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PetType getSpecies() {
        return species;
    }

    public void setSpecies(PetType species) {
        this.species = species;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public String toString() {
        return species.toString().toLowerCase() + "{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && trickLevel == pet.trickLevel && Objects.equals(nickname, pet.nickname) && species == pet.species;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, age, species, trickLevel);
    }
}
