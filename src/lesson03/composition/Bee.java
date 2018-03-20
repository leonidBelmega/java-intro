package lesson03.composition;

class Bee extends Insect implements Attack {
    private Attack attack;

    public Bee(int size, String color, Attack attack) {
        super(size, color);
        this.attack = attack;
    }

      public void move() {
        attack.move();
    }

      public void attack() {
        attack.attack();
    }

    public static void main(String[] args) {
        AttackImpl attack1 = new AttackImpl("flying", "Sting");
        Bee bee = new Bee(23, "yellow", attack1);
        bee.attack();
        bee.move();
    }
}
