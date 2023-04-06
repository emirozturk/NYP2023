public class Main {
    public static void main(String[] args) {
        var miner = new Miner();
        var lumberjack = new Lumberjack();
        var attacker = new Attacker();
        System.out.println(miner);
        miner.speak();
        miner.order();
        System.out.println(lumberjack);
        lumberjack.speak();
        lumberjack.order();
        System.out.println(attacker);
        attacker.speak();
        attacker.order();
    }
}