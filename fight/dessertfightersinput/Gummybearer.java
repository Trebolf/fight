package fight.dessertfightersinput;

public class Gummybearer extends Fighter {

    public Gummybearer() {
        super();
    }

    public Boolean heal(Fighter self) {
        Integer damageHealed = Random.wholeNumber(getMinDamage(),getMaxDamage());
        this.setHealth(this.getHealth() + damageHealed);

        System.out.println(this.getName() + " eats a gummy and heals himself for " + damageHealed + " health!");
        System.out.println(this.getName() + " has " + this.getHealth() + " health left.");
        System.out.println();

        return damageHealed > 0;
    }
}
