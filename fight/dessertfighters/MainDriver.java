package fight.dessertfighters;

public class MainDriver {
    public static void main(String[] args) throws InterruptedException {
        Canezerker fighter1 = new Canezerker();
        Gummybearer fighter2 = new Gummybearer();

        fighter1.setName("Cane");
        fighter1.setHealth(100);
        fighter1.setMinDamage(15);
        fighter1.setMaxDamage(30);

        fighter2.setName("Gummy");
        fighter2.setHealth(150);
        fighter2.setMinDamage(10);
        fighter2.setMaxDamage(20);

        Battle battle = new Battle();
        battle.fight(fighter1, fighter2);
    }
}
