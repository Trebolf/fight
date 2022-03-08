package fight.dessertfightersinput;

import java.util.Scanner;

public class Battle {

    private boolean aiTakesTurn = true;
    private int round = 0;

    public void fight(Fighter one, Fighter two) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        boolean areAlive = true;

        while (areAlive) {
            System.out.println("ROUND " + getRound());
            System.out.println("(" + one.getName() + " HP: " + one.getHealth() + ")" + " (" + two.getName() + " HP: " + two.getHealth() + ")");
            System.out.println("1) Attack");
            System.out.println("2) " + one.getSpecial1Name());
            System.out.println("3) " + one.getSpecial2Name());
            System.out.print("Insert input here: ");

            setAiTakesTurn(true);

            String input = sc.nextLine();

            switch (input) {
                case "1" -> one.attack(two);
                case "2" -> one.special1(two);
                case "3" -> one.special2(two);
                case "0" -> areAlive = false;
                default -> System.out.println("INVALID INPUT");
            }

            //two's turn
            if(two.getHealth() > 0 && getAiTakesTurn()) {
                int chance = Random.wholeNumber(1,20);
                if (chance > 0 && chance < 15) {
                    two.attack(one);
                } else if (chance >= 15 && chance <= 17){
                    two.special1(one);
                } else {
                    two.special2(one);
                }
                setRound(getRound()+1);
            } else {
                setRound(getRound()-1);
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

    public boolean getAiTakesTurn() {
        return aiTakesTurn;
    }

    public void setAiTakesTurn(boolean aiTakesTurn) {
        this.aiTakesTurn = aiTakesTurn;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }
}