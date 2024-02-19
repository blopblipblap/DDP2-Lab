public class Dwarf extends Creature {
    private String type;

    public Dwarf(String name, int health) {
        super(name, health);
        this.type = "Dwarf";
        System.out.println("Dwarf " + this.getName() + " is ready for the war!");
    }

    public String getInfo() {
        return String.format(
            "Name: %s\nType: Dwarf\nHealth: %d\n",
            this.getName(), this.getHealth()
        );
    }

    public String getType() {
        return this.type;
    }

    public void doFight(Creature that) {
        //TODO: implement doFight
        that.setHealth(that.getHealth() - 80);
    }
}
