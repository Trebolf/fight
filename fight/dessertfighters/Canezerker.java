package fight.dessertfighters;

import fight.Random;

public class Canezerker extends Fighter{

    /*String name;
    Integer health;
    Integer min;
    Integer max;*/

    public Canezerker() {
        super();
        /*name = jobName;
        health = jobHealth;
        min = minDamage;
        max = maxDamage;*/
    }

    public Boolean rush(Fighter fighter) {
        Integer damageTakenRange = Random.wholeNumber(this.getMinDamage(),this.getMaxDamage());
        Integer damageTakenRangeCrit = damageTakenRange * 2;
        Integer targetHealthLeft = fighter.takeDamage(damageTakenRangeCrit);

        if(targetHealthLeft <= 0) {
            System.out.println(this.getName() + " uses Rush!");
            System.out.println(this.getName() + " attacks " + fighter.getName() + " with a series of blows for " + damageTakenRange + " x 2 = " + damageTakenRangeCrit + " damage!");
            System.out.println(this.getName().toUpperCase() + " WINS!!");
        } else {
            System.out.println(this.getName() + " uses Rush!");
            System.out.println(this.getName() + " attacks " + fighter.getName() + " with a series of blows for " + damageTakenRange + " x 2 = " + damageTakenRangeCrit + " damage!");
            System.out.println(fighter.getName() + " has " + fighter.getHealth() + " health left.");
            System.out.println();
        }
        return targetHealthLeft > 0;
    }
}
