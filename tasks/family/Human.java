package family;

import java.util.Arrays;
import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private int birthYear;
    private int iq;
    private String[][] schedule = {};
    private Family family;

//    private Human mother;
//    private Human father;
//    private Pet pet


    public Human(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

//    public Human(String name, String surname, int birthYear) {
//        this.name = name;
//        this.surname = surname;
//        this.birthYear = birthYear;
//        this.mother = new Human(motherName, motherSurname, motherBirthYear);
//        this.father = new Human(fatherName, fatherSurname, fatherBirthYear);
//    }

    public Human(String name, String surname, int birthYear, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.iq = iq;
//        this.pet = pet;
//        this.mother = mother;
//        this.father = father;
        this.schedule = schedule;
    }

    public Human() {
    }


    //    public void greetPet() {
    //        System.out.println("Привет, " + this.pet.getNickname());
    //    }

    //    public void describePet() {
    //        System.out.println("У меня есть " + this.pet.getSpecies().toString() + ", ему " + this.pet.getAge() + " лет" + " он " + this.pet.getTrickLevelDescription());
    //    }


    public String getFullName() {
        return this.name + " " + this.surname;
    }

    public String scheduleToString() {

        if (this.schedule.length > 0) {

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[ ");

            for (String[] item : this.schedule) {
                stringBuilder.append(Arrays.toString(item));
            }
            stringBuilder.append(" ]");

            return stringBuilder.toString();
        }

        return "[]";
    }

//    @Override
//    public String toString() {
//        return "Human{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", year=" + birthYear +
//                ", iq=" + iq +
//                ", pet=" + this.family.getPet() +
//                ", father=" + this.family.getFather().getFullName() +
//                ", mother=" + this.family.getMother().getFullName() +
//                ", pet=" + pet +
//                ", mother=" + mother.getFullName() +
//                ", father=" + father.getFullName() +
//                '}';
//    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + birthYear +
                ", iq=" + iq +
                ", schedule=" + this.scheduleToString() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

//    public Pet getPet() {
//        return pet;
//    }

//    public void setPet(Pet pet) {
//        this.pet = pet;
//    }

//    public Human getMother() {
//        return mother;
//    }

//    public void setMother(Human mother) {
//        this.mother = mother;
//    }

//    public Human getFather() {
//        return father;
//    }

//    public void setFather(Human father) {
//        this.father = father;
//    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birthYear == human.birthYear && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthYear, iq);
    }
}
