package fight.dessertfightersinput;


import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) throws InterruptedException {
        Fighter fighter;
        Fighter enemy;

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your class: ");
        System.out.println("1) Canezerker");
        System.out.println("2) Gummybearer");
        String job = sc.nextLine();
        switch (job) {
            case "1" -> fighter = new Canezerker();
            case "2" -> fighter = new Gummybearer();
            default -> {
                System.out.println("INVALID INPUT");
                fighter = new Canezerker();
            }
        }

        /*System.out.print("Insert the name of your fighter: ");
        String name = sc.nextLine();
        fighter.setName(name);

        System.out.print("Insert the amount of health " + fighter.getName() + " has: ");
        String health = String.valueOf(sc.nextLine());
        fighter.setHealth(Integer.valueOf(health));

        System.out.print("Insert the minimum damage " + fighter.getName() + " has: ");
        String minDamage = String.valueOf(sc.nextLine());
        fighter.setMinDamage(Integer.valueOf(minDamage));

        System.out.print("Insert the maximum damage " + fighter.getName() + " has: ");
        String maxDamage = String.valueOf(sc.nextLine());
        fighter.setMaxDamage(Integer.valueOf(maxDamage));*/

        System.out.println();

        System.out.println("Choose your enemy: ");
        System.out.println("1) Canezerker");
        System.out.println("2) Gummybearer");
        String enemyJob = sc.nextLine();
        switch (enemyJob) {
            case "1" -> enemy = new Canezerker();
            case "2" -> enemy = new Gummybearer();
            default -> {
                System.out.println("INVALID INPUT");
                enemy = new Canezerker();
            }
        }
        Battle battle = new Battle();
        battle.fight(fighter, enemy);
    }
}
