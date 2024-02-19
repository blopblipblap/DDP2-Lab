public class Elf extends Creature {
    private String type;

    public Elf(String name, int health) {
        super(name, health);
        this.type = "Elf";
        System.out.println("Elf " + this.getName() + " is ready for the war!");
    }

    public String getInfo() {
        return String.format(
            "Name: %s\nType: Elf\nHealth: %d\n",
            this.getName(), this.getHealth()
        );
    }

    public String getType() {
        return this.type;
    }

    public void doFight(Creature that) {
        //TODO: implement doFight
        that.setHealth(that.getHealth() - 150);
    }
}
