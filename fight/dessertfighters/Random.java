package fight.dessertfighters;

public class Random {
    public static int wholeNumber(int min, int max) {

        return (int) (Math.random() * ((max - min) + 1)) + min;
        }
}
