package pl.sdacademy.designpatterns.behavioral.observer;

public class PressReader implements PressObserver {
    private String name;

    public PressReader(String name) {
        this.name = name;
    }

    @Override
    public void update(String paper) {
        System.out.println("Czytelnik " + name + " czyta: " + paper);
    }
}
