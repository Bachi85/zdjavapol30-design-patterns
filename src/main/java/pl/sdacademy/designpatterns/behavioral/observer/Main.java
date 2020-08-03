package pl.sdacademy.designpatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        PressPublisher pressPublisher = new PressPublisher("Wydawca xyz");
        PressReader adamNowak = new PressReader("Adam Nowak");
        pressPublisher.addObserver(adamNowak);
        PressReader janKowalski = new PressReader("Jan Kowalski");
        pressPublisher.addObserver(janKowalski);

        pressPublisher.publish("Nowe wydanie gazety ABC!");


        Billboard billboard = new Billboard();
        pressPublisher.addObserver(billboard);

    }
}
