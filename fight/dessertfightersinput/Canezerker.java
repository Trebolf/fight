package fight.dessertfightersinput;

import fight.Random;

public class Canezerker extends Fighter {

    //ENCAPSULATED VARS
    private int turnsToCooldown = 0;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    //CONSTRUCTOR
    public Canezerker() {
        this.setName("Citizen Cane");
        this.setHealth(100);
        this.setMinDamage(15);
        this.setMaxDamage(30);
        this.setSpecial1Name("Rush");
        this.setSpecial2Name("Sharpen");
    }

    //OVERRIDDEN METHODS
    public void attack(Fighter fighter) {
        super.attack(fighter);
        this.setTurnsToCooldown(getTurnsToCooldown() - 1);
    }

    //METHODS
    public void special1(Fighter fighter) {
        int damageTakenRange = Random.wholeNumber(this.getMinDamage(),this.getMaxDamage());
        Integer damageTakenRangeCrit = damageTakenRange * 2;
        Integer ownHealthLeft = this.getHealth();
        Integer targetHealthLeft = fighter.getHealth();

        if(this.getTurnsToCooldown() <= 0) {
            fighter.takeDamage(damageTakenRangeCrit);

            System.out.println(this.getName() + " uses Rush!");
            System.out.println(this.getName() + " attacks " + fighter.getName() + " with a series of blows for " + damageTakenRange + " x 2 = " + damageTakenRangeCrit + " damage!");

            if (targetHealthLeft <= 0 || ownHealthLeft <= 0) {
                System.out.println(this.getName().toUpperCase() + " WINS!!");
            } else {
                System.out.println(fighter.getName() + " has " + fighter.getHealth() + " health left.");
                System.out.println();

                this.setTurnsToCooldown(3);
            }
        } else {
            System.out.println("Rush is on cooldown for " + this.getTurnsToCooldown() + " turns.");
            System.out.println();
        }
    }

    public void special2(Fighter fighter) {
        Integer extraDamage = 5;
        this.setMinDamage(this.getMinDamage() + extraDamage);
        this.setMaxDamage(this.getMaxDamage() + extraDamage);

        System.out.println(this.getName() + " licks his canes and sharpens them!");
        System.out.println(this.getName() + " will deal " + extraDamage + " bonus damage with their attacks!");
        System.out.println(this.getName() + "'s damage range is now: " + ANSI_RED + getMinDamage() + " - " + getMaxDamage() + ANSI_RESET + "!");
        System.out.println();

        this.setTurnsToCooldown(getTurnsToCooldown() - 1);
    }

    public int getTurnsToCooldown() {
        return turnsToCooldown;
    }

    public void setTurnsToCooldown(int turnsToCooldown) {
        this.turnsToCooldown = turnsToCooldown;
    }
}
