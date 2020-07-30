package pl.sdacademy.designpatterns.creational.singleton.lazy.v1;

public class Universe {
    private static Universe instance;

    public static Universe getInstance() {
        if (instance == null) {
            synchronized (Universe.class) {
                if (instance == null) {
                    instance = new Universe();
                }
            }

        }
        return instance;
    }

    private Universe() {
        System.out.println("Tworze instancje");
    }

    private long age = 123412341234L;

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }
}