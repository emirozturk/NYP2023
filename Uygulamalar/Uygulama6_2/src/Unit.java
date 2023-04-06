public abstract class Unit {
    private int hp;
    private int ap;

    public Unit(int hp, int ap) {
        this.hp = hp;
        this.ap = ap;
    }

    @Override
    public String toString() {
        return String.format("HP:%d-AP:%d", hp, ap);
    }

    public void speak() {
        System.out.println("Evet");
    }
}
