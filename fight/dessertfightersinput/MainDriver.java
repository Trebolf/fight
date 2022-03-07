package fight.dessertfightersinput;

import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) throws InterruptedException {
        Canezerker fighter1 = new Canezerker();
        Gummybearer fighter2 = new Gummybearer();
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the name of your fighter: ");
        String name = sc.nextLine();
        fighter1.setName(name);

        System.out.print("Insert the amount of health " + fighter1.getName() + " has: ");
        String health = String.valueOf(sc.nextLine());
        fighter1.setHealth(Integer.valueOf(health));

        System.out.print("Insert the minimum damage " + fighter1.getName() + " has: ");
        String minDamage = String.valueOf(sc.nextLine());
        fighter1.setMinDamage(Integer.valueOf(minDamage));

        System.out.print("Insert the maximum damage " + fighter1.getName() + " has: ");
        String maxDamage = String.valueOf(sc.nextLine());
        fighter1.setMaxDamage(Integer.valueOf(maxDamage));

        System.out.println();

        fighter2.setName("Gummy");
        fighter2.setHealth(150);
        fighter2.setMinDamage(10);
        fighter2.setMaxDamage(20);

        Battle battle = new Battle();
        battle.fight(fighter1, fighter2);
    }
}
