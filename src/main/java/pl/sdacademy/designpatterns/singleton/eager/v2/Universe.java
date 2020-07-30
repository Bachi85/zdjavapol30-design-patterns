package pl.sdacademy.designpatterns.singleton.eager.v2;

public class Universe {
    public final static Universe INSTANCE = new Universe();

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