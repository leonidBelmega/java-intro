package lesson03.inharitance;

public class Bee extends Insect {
    public Bee(int size, String color) {
        super(size, color);

    }

    @Override
    public void move() {
        flyBee();

    }

    public void flyBee() {
        System.out.println("Fly");
    }

    @Override
    public void attack() {
        flyBee();
        super.attack();
    }

    public static void main(String[] args) {
        Bee bee = new Bee(12, "yellow-black");
        bee.attack();
    }
}
