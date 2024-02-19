// TODO: perbaiki class ini sesuai konsep OOP
public class Cat extends Pet {

    // TODO: tambahkan data field JIKA diperlukan
    
    // TODO: lengkapi constructor sesuai konsep OOP
    public Cat(String name, int age) {
        super(name, age, 100, new Idle());
        System.out.println(String.format("%s has arrived!", this.toString(), getName()));
    }

    // TODO: tambahkan method-method lain yang diperlukan
    public void makeSound() {
        System.out.println(String.format("%s: Meowww", this.toString()));
    }

    public void doPower() {
        System.out.println(String.format("%s: Scratching...", this.toString()));
    }
    
    public void play() {
        if (statusEquals("idle")) {
            System.out.println(String.format("%s is playing...", this.toString()));
            setHappiness(getHappiness() + 15);
        }
        else {
            System.out.println(String.format("%s can't play right now!", this.toString()));  
        }
    }
    
    public String toString() {
        return String.format("[Cat - %d - %d] %s", getAge(), getHappiness(), getName());
    }
}