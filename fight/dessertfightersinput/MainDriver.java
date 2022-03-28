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
        System.out.println();

        Battle battle = new Battle();
        battle.fight(fighter, enemy);
    }
}
