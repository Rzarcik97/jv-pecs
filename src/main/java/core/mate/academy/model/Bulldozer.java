package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int dozerWidth;
    private int dozerHeight;

    public Bulldozer(String name, String color, int dozerWidth, int dozerHeight) {
        super(name, color);
        this.dozerWidth = dozerWidth;
        this.dozerHeight = dozerHeight;
    }

    public Bulldozer() {
    }

    public int getDozerHeight() {
        return dozerHeight;
    }

    public void setDozerHeight(int dozerHeight) {
        this.dozerHeight = dozerHeight;
    }

    public int getDozerWidth() {
        return dozerWidth;
    }

    public void setDozerWidth(int dozerWidth) {
        this.dozerWidth = dozerWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
