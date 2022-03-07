package fight.dessertfighters;

public abstract class RandomGenerator {
    private Integer minDamage;
    private Integer maxDamage;


    static int randomizer(Integer min, Integer max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public Integer getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(Integer minDamage) {
        this.minDamage = minDamage;
    }

    public Integer getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(Integer maxDamage) {
        this.maxDamage = maxDamage;
    }
}