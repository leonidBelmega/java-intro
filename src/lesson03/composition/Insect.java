package lesson03.composition;



class Insect {
    private int size;
    private String color;

    public Insect(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public static class AttackImpl implements Attack {
        private  String move;
        private String attack;

        public  AttackImpl (String move, String attack) {
            this.move = move;
            this.attack = attack;
        }
        @Override
        public void move() {
            System.out.println(move);
        }
        @Override
        public void attack() {
            move();
            System.out.println(attack);
        }

    }
}

