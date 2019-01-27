package springioc.animal;

public class Cat {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public Cat() {
        this.name = "default";
    }
    public Cat(String name) {
        this.name = name;
    }

    public String toString() {
        return "Cat name: " + name;
    }
}
