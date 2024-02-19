public abstract class Creature {
    private final String name;
    private int health;

    public Creature(final String name, final int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(final int health) {
        this.health = health;
    }

    public abstract String getInfo();

    public abstract void doFight(Creature that);

    public abstract String getType();
}
