// TODO: perbaiki class ini sesuai konsep OOP agar sesuai dengan spesifikasi program
public abstract class Pet implements PetBehavior {

    // TODO: tambahkan data field yang diperlukan
    private String name;
    private int age;
    private int happiness;
    private StatusBehavior statusBehavior;

    // TODO: lengkapi constructor
    public Pet(String name, int age, int happiness, StatusBehavior statusBehavior) {
        this.name = name;
        this.age = age;
        this.happiness = happiness;
        this.statusBehavior = statusBehavior;
    }

    @Override
    public abstract void makeSound();

    @Override
    public abstract void doPower();

    @Override
    public abstract void play();

    // TODO: tambahkan method-method lain yang diperlukan
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    
    public int getHappiness() {
        return this.happiness;
    }
    
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
    
    public void setStatusBehavior (StatusBehavior status) {
        this.statusBehavior = status;
    }

    // HINT: gunakan method ini untuk mengecek status ketika mengimplementasikan method play()
    public boolean statusEquals(String status) {
        return statusBehavior.currentStatus().equalsIgnoreCase(status);
    }
}
