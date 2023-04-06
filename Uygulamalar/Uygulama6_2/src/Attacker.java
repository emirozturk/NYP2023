public class Attacker extends Unit {
    public Attacker() {
        super(150, 10);
    }

    @Override
    public String toString() {
        return "Attacker-" + super.toString();
    }

    @Override
    public void speak() {
        System.out.println("Evet!");
    }

    public void order() {
        System.out.println("Saldır!");
    }
}
