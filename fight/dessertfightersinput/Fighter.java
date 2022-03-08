package fight.dessertfightersinput;

import fight.Random;

public abstract class Fighter {

    //ENCAPSULATED VARIABLES
    private String name;
    private Integer health;
    private Integer minDamage;
    private Integer maxDamage;
    private String special1Name;
    private String special2Name;

    //ABSTRACT METHODS
    public abstract void special1(Fighter fighter);
    public abstract void special2(Fighter fighter);

    //METHODS
    public void takeDamage(Integer damageTaken) {
        this.health = this.health - damageTaken;
    }

    public void attack(Fighter fighter) {
        Integer damageTakenRange = Random.wholeNumber(this.getMinDamage(),this.getMaxDamage());
        Integer ownHealthLeft = this.getHealth();
        Integer targetHealthLeft = fighter.getHealth();

        fighter.takeDamage(damageTakenRange);

        if(targetHealthLeft <= 0 || ownHealthLeft <= 0) {
            System.out.println(this.getName() + " hits the final blow for " + damageTakenRange + " damage.");
        } else {
            System.out.println(this.getName() + " attacks " + fighter.getName() + " for " + damageTakenRange + " damage.");
            System.out.println(fighter.getName() + " has " + fighter.getHealth() + " health left.");
            System.out.println();
        }
    }

    //GETTERS AND SETTERS
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

    public String getSpecial1Name() {
        return special1Name;
    }

    public void setSpecial1Name(String special1Name) {
        this.special1Name = special1Name;
    }

    public String getSpecial2Name() {
        return special2Name;
    }

    public void setSpecial2Name(String special2Name) {
        this.special2Name = special2Name;
    }
}
