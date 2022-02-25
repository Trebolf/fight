package fight;

public class Enemy {

    static String name;
    static int health = 0;

    static int attack(int damageAmount) {
        health = health - damageAmount;
        return damageAmount;
    }

    static int special(int damageAmount) {
        health = health - damageAmount;
        return health;
    }

    static int heal(int healthHealed) {
        health = health + healthHealed;
        return health;
    }

    public Enemy(String enemyName, int enemyHealth) {
        name = enemyName;
        health = enemyHealth;
    }
}

