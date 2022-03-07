package fight.dessertfighters;

import fight.Random;

public abstract class Fighter {

    private String name;
    private Integer health;
    private Integer minDamage;
    private Integer maxDamage;

    public Fighter() {

    }

    public Integer takeDamage(Integer damageTaken) {
        this.health = this.health - damageTaken;
        return this.health;
    }

    public Boolean critical(Fighter fighter) {
        Integer damageTakenRange = Random.wholeNumber(this.getMinDamage(),this.getMaxDamage());
        Integer damageTakenRangeCrit = damageTakenRange * 2;
        Integer targetHealthLeft = fighter.takeDamage(damageTakenRangeCrit);

        if(targetHealthLeft <= 0) {
            System.out.println("IT'S A CRITICAL HIT!!");
            System.out.println(this.getName() + " hits the final blow for " + damageTakenRange + " x 2 = " + damageTakenRangeCrit + " damage!!");
            System.out.println(this.getName().toUpperCase() + " WINS!!");
        } else {
            System.out.println("IT'S A CRITICAL HIT!!");
            System.out.println(this.getName() + " attacks " + fighter.getName() + " for " + damageTakenRange + " x 2 = " + damageTakenRangeCrit + " damage!!");
            System.out.println(fighter.getName() + " has " + fighter.getHealth() + " health left.");
            System.out.println();
        }
        return targetHealthLeft > 0;
    }

    public Boolean attack(Fighter fighter) {
        Integer damageTakenRange = Random.wholeNumber(this.getMinDamage(),this.getMaxDamage());
        Integer targetHealthLeft = fighter.takeDamage(damageTakenRange);

        if(targetHealthLeft <= 0) {
            System.out.println(this.getName() + " hits the final blow for " + damageTakenRange + " damage.");
            System.out.println(this.getName().toUpperCase() + " WINS!!");
        } else {
            System.out.println(this.getName() + " attacks " + fighter.getName() + " for " + damageTakenRange + " damage.");
            System.out.println(fighter.getName() + " has " + fighter.getHealth() + " health left.");
            System.out.println();
        }
        return targetHealthLeft > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(Integer minDamage) {
        this.minDamage = minDamage;
    }

    public Integer getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(Integer maxDamage) {
        this.maxDamage = maxDamage;
    }
}
