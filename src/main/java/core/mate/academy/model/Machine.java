package core.mate.academy.model;

public abstract class Machine implements Workable {
    private String name;
    private String color;

    public Machine(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Machine() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
