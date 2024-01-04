package ppj23.task3;

public class Main {

    public static void main(String[] args) {
        Sosna sosna = new Sosna();
        Sliwa sliwa = new Sliwa();
        Deb deb = new Deb();
        Morelowiec morelowiec = new Morelowiec();
        Modrzewo modrzewo = new Modrzewo();
        Osika osika = new Osika();

        Tree[] trees = {
                sosna, sliwa, deb, morelowiec, modrzewo, osika
        };

        for (Tree t: trees) System.out.println(t);

        try {
            sosna.pickFruit();
        }catch (TreeWithoutFruitException e) {
            System.out.println(e.getMessage());
        }

        try {
            sliwa.pickFruit();
        }catch (TreeWithoutFruitException e) {
            System.out.println(e.getMessage());
        }

    }

}
