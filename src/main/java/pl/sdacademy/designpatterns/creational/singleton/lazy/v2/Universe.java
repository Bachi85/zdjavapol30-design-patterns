package pl.sdacademy.designpatterns.creational.singleton.lazy.v2;

public enum Universe {
    INSTANCE;


    private long age =123412341234L;

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }
}
