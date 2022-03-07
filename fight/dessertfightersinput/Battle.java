package fight.dessertfightersinput;

import java.util.Scanner;

public class Battle {
    public void fight(Canezerker one, Gummybearer two) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Integer round = 1;
        Integer turnsToCooldown = 0;
        Boolean areAlive = true;

        while (areAlive) {
            System.out.println("ROUND " + round++);
            System.out.println("(" + one.getName() + " HP: " + one.getHealth() + ")" + " (" + two.getName() + " HP: " + two.getHealth() + ")");
            System.out.println("1) Attack");
            System.out.println("2) Rush");

            String input = sc.nextLine();

            switch (input) {
                case "1":
                    one.attack(two);
                    turnsToCooldown--;
                    break;
                case "2":
                    if (turnsToCooldown <= 0) {
                        if (one.rush(two)) {
                            turnsToCooldown = 3;
                        }
                    } else {
                        System.out.println("Rush is on cooldown for " + turnsToCooldown + " turns.");
                        System.out.println();
                        break;
                    }
                    turnsToCooldown--;
                    break;
                case "0":
                    break;
                default:
                    break;
            }

            //two's turn. Heal to be added
            if(two.getHealth() > 0) {
                two.attack(one);
            }

            if (one.getHealth() <= 0 || two.getHealth() <= 0) {
                if(one.getHealth() <= 0) {
                    System.out.println(two.getName().toUpperCase() + " WINS!");
                } else {
                    System.out.println(one.getName().toUpperCase() + " WINS!");
                }
                areAlive = false;
            }
        }
    }
}