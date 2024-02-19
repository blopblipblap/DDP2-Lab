// TODO: perbaiki class ini sesuai konsep OOP
public class Dog extends Pet {

    // TODO: tambahkan data field JIKA diperlukan

    // TODO: lengkapi constructor sesuai konsep OOP
    public Dog(String name, int age) {
        super(name, age, 100, new Idle());
        System.out.println(String.format("%s has arrived!", this.toString(), getName()));
    }

    // TODO: tambahkan method-method lain yang diperlukan
    public void makeSound() {
        System.out.println(String.format("%s: Woof woof", this.toString()));
    }

    public void doPower() {
        System.out.println(String.format("%s: Biting...", this.toString()));
    }
    
    public void play() {
        if (statusEquals("idle")) {
            System.out.println(String.format("%s is playing...", this.toString()));
            setHappiness(getHappiness() + 20);
        }
        else {
            System.out.println(String.format("%s can't play right now!", this.toString()));  
        }
    }
    
    public String toString() {
        return String.format("[Dog - %d - %d] %s", getAge(), getHappiness(), getName());
    }
}
