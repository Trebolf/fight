package fight;

public class Hero {
    static String name;
    static int health = 0;

    static int attack(int damageAmount) {
        health = health - damageAmount;
        return damageAmount;
    }

    static int special(int damageAmount) {
        health = health - damageAmount;
        return damageAmount;
    }

    static int heal(int healthHealed) {
        health = (int) (health + healthHealed);
        return health;
    }

    public Hero(String heroName, int startingHealth) {
        name = heroName;
        health = startingHealth;
    }
}
