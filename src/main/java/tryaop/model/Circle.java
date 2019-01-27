package tryaop.model;

import tryaop.annotation.Logable;

public class Circle {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getNumber() {
        return 100;
    }

    @Logable
    public void use_around() {
        System.out.println("use around");
    }

    public String setInName(String name) {
        System.out.println("setInName");
        return "Mrs. " + name;
    }

    public int myDouble(int i) {
        System.out.println("exec mydouble");
        return i * 2;
    }
}
