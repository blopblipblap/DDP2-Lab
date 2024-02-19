public class Hobbit extends Creature {
    private String type;

    public Hobbit(String name, int health) {
        super(name, health);
        this.type = "Hobbit";
        System.out.println("Hobbit " + this.getName() + " is ready for the war!");
    }

    public String getInfo() {
        return String.format(
            "Name: %s\nType: Hobbit\nHealth: %d\n",
            this.getName(), this.getHealth()
        );
    }

    public String getType() {
        return this.type;
    }

    public void doFight(Creature that) {
        //TODO: implement doFight
        that.setHealth(that.getHealth() - 25);
    }
}
