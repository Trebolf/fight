package fight.dessertfightersinput;

public class Gummybearer extends Fighter {

    //CONSTRUCTOR
    public Gummybearer() {
        this.setName("Jelly Ursa");
        this.setHealth(150);
        this.setMinDamage(10);
        this.setMaxDamage(20);
        this.setSpecial1Name("Heal");
        this.setSpecial2Name("Buffet");
    }

    //METHODS
    public void special1(Fighter fighter) {
        Integer damageHealed = Random.wholeNumber(getMinDamage(),getMaxDamage());
        this.setHealth(this.getHealth() + damageHealed);

        System.out.println(this.getName() + " eats a gummy and heals himself for " + damageHealed + " health!");
        System.out.println(this.getName() + " has " + this.getHealth() + " health left.");
        System.out.println();
    }

    public void special2(Fighter fighter) {
        Integer damageHealed = Random.wholeNumber(getMinDamage(), getMaxDamage());
        Integer damageHealedCrit = damageHealed * 2;
        this.setHealth(this.getHealth() + damageHealed);

        System.out.println(this.getName() + " eats a gummy and heals himself for " + damageHealedCrit + " health!");
        System.out.println(this.getName() + " has " + this.getHealth() + " health left.");
        System.out.println();
    }
}
