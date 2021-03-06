package pl.sdacademy.designpatterns.creational.singleton.eager.v1;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Start aplikacji");
        System.out.println("Ładowanie klasy universe");
        Class.forName("pl.sdacademy.designpatterns.creational.singleton.v2.Universe");
        System.out.println("Przypisanie instancji do zmiennej");
        Universe universe = Universe.INSTANCE;
        System.out.println(universe == Universe.INSTANCE);
    }
}
