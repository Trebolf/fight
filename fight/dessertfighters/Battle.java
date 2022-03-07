package fight.dessertfighters;

public class Battle {
    public void fight(Canezerker one, Gummybearer two) throws InterruptedException {
        Boolean fighting = true;
        Integer round = 1;

        while(fighting) {
            System.out.println("ROUND " + round++);
            System.out.println("(" + one.getName() + " HP: " + one.getHealth() + ")" + " (" + two.getName() + " HP: " + two.getHealth() + ")");

            Boolean isAlive = true;

            switch (Random.wholeNumber(1,20)){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    isAlive = one.attack(two);
                    break;
                case 9:
                case 10:
                    isAlive = one.rush(two);
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    isAlive = two.attack(one);
                    break;
                case 19:
                case 20:
                    isAlive = two.heal(two);
                    break;
            }

            if(!isAlive)
                fighting = false;

            Thread.sleep(1000);

        }
    }
}
