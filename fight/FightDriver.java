package fight;


import java.sql.SQLOutput;

public class FightDriver {
    public static void main(String[] args) {

        Hero hero = new Hero("Shrek", 100);
        Enemy enemy = new Enemy("Donkey", 100);

        int repeat;

        for (repeat = 0; repeat < 50; repeat++) {
            //HERO ATTACKS ENEMY
            System.out.println("(" + hero.name + " HP: " + hero.health + ")" + " (" + enemy.name + " HP: " + enemy.health + ")");

            int damagetoenemy = Enemy.attack(Random.wholeNumber(1, 20));

            if (enemy.health < 0) {
                System.out.println(hero.name + " attacks " + enemy.name + " for " + damagetoenemy + " damage.");
                System.out.println(enemy.name + " couldn't take the " + "big dick damage.".toUpperCase());
                System.out.println(enemy.name + " is dead.");
                System.out.println(hero.name + " wins.");
                break;
            } else {
                System.out.println(hero.name + " attacks " + enemy.name + " for " + damagetoenemy + " damage.");
                System.out.println(enemy.name + " has " + enemy.health + " health remaining.");
                System.out.println();
            }
            //ENEMY ATTACKS HERO
            int damagetohero = Hero.attack(Random.wholeNumber(1, 20));

            if (hero.health < 0) {
                System.out.println(enemy.name + " attacks " + hero.name + " for " + damagetohero + " damage.");
                System.out.println(hero.name + " couldn't take the " + "big dick damage.".toUpperCase());
                System.out.println(hero.name + " is dead.");
                System.out.println(enemy.name + " wins.");
                break;
            } else {
                System.out.println(enemy.name + " attacks " + hero.name + " for " + damagetohero + " damage.");
                System.out.println(hero.name + " has " + hero.health + " health remaining.");
                System.out.println();
                System.out.println();
            }
        }
    }
}
