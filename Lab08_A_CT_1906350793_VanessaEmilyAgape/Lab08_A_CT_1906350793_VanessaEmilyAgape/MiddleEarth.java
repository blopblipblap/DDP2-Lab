import java.util.ArrayList;
import java.util.List;

public class MiddleEarth {
    //TODO: data field & Constructor
    private List<Creature> listCreature = new ArrayList<>();

    public void addCreature(String type, String name, int health) throws CantCreateException{
        //TODO : Implement add creture to list
        if (type.equals("Elf"))
            if (health > 3000)
                throw new CantCreateException(String.format("CantCreateException: Maximum Health for %s is %d"));
            else
                listCreature.add(new Elf(name, health));
        else if (type.equals("Dwarf")) 
            if (health > 2200)
                throw new CantCreateException(String.format("CantCreateException: Maximum Health for %s is %d"));
            else
                listCreature.add(new Dwarf(name, health));
        else
            if (health > 1500)
                throw new CantCreateException(String.format("CantCreateException: Maximum Health for %s is %d"));
            else
                listCreature.add(new Hobbit(name, health));
    }

    public void doFight(String thisCreature, String thatCreature) throws CivilWarOccuredException{
        //TODO: implement doFight
        Creature creature1 = this.creatureFindByName(thisCreature);
        Creature creature2 = this.creatureFindByName(thatCreature);
        if (creature1.equals(creature2)) {
            throw new CivilWarOccuredException("HEYOO CIVIL WAR OCCURED");
        }
        while (creature1.getHealth() != 0 && creature2.getHealth() != 0) {
            creature1.doFight(creature2);
            if (creature1.getHealth() == 0 || creature2.getHealth() == 0) {
                break;
            }
            creature2.doFight(creature1);
        }
        if (creature1.getHealth() == 0)
            System.out.println(thisCreature + "Death");
        else
            System.out.println(thatCreature + "Death");
        
    }

    public Creature creatureFindByName(String name) {
        for (Creature creature : listCreature){
            if (creature.getName().equals(name)){
                return creature;
            }
        }
        return null;
    }

    public String getCreaturesInfo() {
        //TODO: implement get information of creature
        String getInfo = "";
        for (Creature creature : listCreature){
            getInfo += String.format("Name: %s\n", creature.getName());
            getInfo += String.format("Type: %s\n", creature.getType());
            getInfo += String.format("Health: %s\n\n", creature.getHealth());
        }
        return getInfo;
    }

    public List<Creature> getCreatureList() {
        return this.listCreature;
    }
}
