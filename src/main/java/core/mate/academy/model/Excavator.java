package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketCapacity;
    private int boomReach;

    public Excavator(String name, String color, int bucketCapacity, int boomReach) {
        super(name, color);
        this.bucketCapacity = bucketCapacity;
        this.boomReach = boomReach;
    }

    public Excavator() {
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public int getBoomReach() {
        return boomReach;
    }

    public void setBoomReach(int boomReach) {
        this.boomReach = boomReach;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
