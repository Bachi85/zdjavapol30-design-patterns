package pl.sdacademy.designpatterns.creational.singleton.lazy.v2;

import pl.sdacademy.designpatterns.creational.singleton.eager.v1.Universe;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
    System.out.println("Start aplikacji");
    System.out.println("Ładowanie klasy universe");
    Class.forName("pl.sdacademy.designpatterns.creational.singleton.v2.Universe");
    System.out.println("Przypisanie instancji do zmiennej");
    pl.sdacademy.designpatterns.creational.singleton.eager.v1.Universe universe = pl.sdacademy.designpatterns.creational.singleton.eager.v1.Universe.INSTANCE;
    System.out.println(universe == Universe.INSTANCE);
    }
}
