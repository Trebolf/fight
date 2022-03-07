package fight;

public class Enemy {

    String name;
    int health = 0;

    int attack(int damageAmount) {
        health = health - damageAmount;
        return damageAmount;
    }

    int special(int damageAmount) {
        health = health - damageAmount;
        return damageAmount;
    }

    int heal(int healthHealed) {
        health = health + healthHealed;
        return health;
    }

    public Enemy(String enemyName, int enemyHealth) {
        name = enemyName;
        health = enemyHealth;
    }
}

