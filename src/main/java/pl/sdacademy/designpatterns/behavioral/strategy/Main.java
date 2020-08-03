package pl.sdacademy.designpatterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Thorgal", new SwordHitStrategy());
        warrior.hit();
        warrior.setHitStrategy(new PunchHitStrategy());
        warrior.hit();
        warrior.setHitStrategy(() -> System.out.println("Uderza siekierą"));
        warrior.hit();
    }
}
