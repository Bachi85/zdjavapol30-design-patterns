package pl.sdacademy.designpatterns.creational.singleton.lazy.v1;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        pl.sdacademy.designpatterns.creational.singleton.eager.v2.Universe universe = pl.sdacademy.designpatterns.creational.singleton.eager.v2.Universe.INSTANCE;
        System.out.println("Start aplikacji");
        System.out.println("Ładowanie klasy universe");
        Class.forName("pl.sdacademy.designpatterns.creational.singleton.v1.Universe");
        System.out.println("Przypisanie instancji do zmiennej");
        Universe universe1 = Universe.getInstance();
        System.out.println(universe1 == Universe.getInstance());
    }
}
