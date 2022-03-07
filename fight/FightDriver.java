package fight;

/*RULES: Hero always attacks first.
*        Default damage is a d20.
*        Attacks always hit.
* */

import fight.dessertfighters.Canezerker;
import fight.dessertfighters.Fighter;
import fight.dessertfighters.Gummybearer;

public class FightDriver {
    public static void main(String[] args) {
        Hero hero = new Hero("Shrek", 100);
        Enemy enemy = new Enemy("Donkey", 100);
        Fighter shrek = new Canezerker();
        Fighter donkey = new Gummybearer();

        Integer accuracy = Random.wholeNumber(1,20);

        int repeat;

        for (repeat = 0; repeat < 999; repeat++) {
            System.out.println("(" + hero.name + " HP: " + hero.health + ")" + " (" + enemy.name + " HP: " + enemy.health + ")");

            //SETTING HERO VALUES
            int accuracyToEnemy = Random.wholeNumber(1, 20);
            int damageToEnemy = Random.wholeNumber(10, 20);
            int criticalToEnemy = damageToEnemy * 2;

            //HERO ATTACKS ENEMY
            //NORMAL ATTACK
            if (accuracyToEnemy >= 3 && accuracyToEnemy <= 18) {
                if (enemy.health < 0) {
                    enemy.attack(damageToEnemy);
                    System.out.println(hero.name + " attacks " + enemy.name + " for " + damageToEnemy + " damage.");
                    System.out.println(enemy.name + " couldn't take the " + "big dick damage.".toUpperCase());
                    System.out.println(enemy.name + " is dead.");
                    System.out.println(hero.name + " wins.");
                    break;
                } else {
                    enemy.attack(damageToEnemy);
                    System.out.println(hero.name + " attacks " + enemy.name + " for " + damageToEnemy + " damage.");
                    System.out.println();
                }
            //CRITICAL ATTACK
            } else if (accuracyToEnemy > 18) {
                if (enemy.health < 0) {
                    enemy.special(criticalToEnemy);
                    System.out.println((hero.name).toUpperCase() + " GOT A CRITICAL HIT!");
                    System.out.println(hero.name + " attacks " + enemy.name + " for " + damageToEnemy + "x2 = " + criticalToEnemy + " damage.");
                    System.out.println(enemy.name + " couldn't take the " + "big dick damage.".toUpperCase());
                    System.out.println(enemy.name + " is dead.");
                    System.out.println(hero.name + " wins.");
                    break;
                } else {
                    enemy.special(criticalToEnemy);
                    System.out.println((hero.name).toUpperCase() + " GOT A CRITICAL HIT!");
                    System.out.println(hero.name + " attacks " + enemy.name + " for " + damageToEnemy + "x2 = " + criticalToEnemy + " damage.");
                    System.out.println();
                }
            //ATTACK MISS
            } else {
                System.out.println(hero.name + " whiffs, the attack misses!");
                System.out.println();
            }


            //SETTING ENEMY VALUES
            int accuracyToHero = Random.wholeNumber(1, 20);
            int damageToHero = Random.wholeNumber(10, 20);
            int criticalToHero = damageToHero * 2;

            //ENEMY ATTACKS HERO
            //NORMAL ATTACK
            if (accuracyToHero >= 3 && accuracyToHero <= 18) {
                if (hero.health < 0) {
                    Hero.attack(damageToHero);
                    System.out.println(enemy.name + " attacks " + hero.name + " for " + damageToHero + " damage.");
                    System.out.println(hero.name + " couldn't take the " + "big dick damage.".toUpperCase());
                    System.out.println(hero.name + " is dead.");
                    System.out.println(enemy.name + " wins.");
                    break;
                } else {
                    Hero.attack(damageToHero);
                    System.out.println(enemy.name + " attacks " + hero.name + " for " + damageToHero + " damage.");
                    System.out.println();
                    System.out.println();
                }
            //CRITICAL ATTACK
            } else if (accuracyToHero > 18) {
                if (hero.health < 0) {
                    Hero.special(criticalToHero);
                    System.out.println((enemy.name).toUpperCase() + " GOT A CRITICAL HIT!");
                    System.out.println(enemy.name + " attacks " + hero.name + " for " + damageToHero + "x2 = " + criticalToHero + " damage.");
                    System.out.println(hero.name + " couldn't take the " + "big dick damage.".toUpperCase());
                    System.out.println(hero.name + " is dead.");
                    System.out.println(enemy.name + " wins.");
                    break;
                } else {
                    Hero.special(criticalToHero);
                    System.out.println((enemy.name).toUpperCase() + " GOT A CRITICAL HIT!");
                    System.out.println(enemy.name + " attacks " + hero.name + " for " + damageToHero + "x2 = " + criticalToHero + " damage.");
                    System.out.println();
                }
            //ATTACK MISS
            } else {
                System.out.println(enemy.name + " whiffs, the attack misses!");
                System.out.println();
                System.out.println();
            }
        }
    }
}
