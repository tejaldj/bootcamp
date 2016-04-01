public class Chance {
    private static final float valueForCertainty = 1f;
    private final float probability;

    public Chance(float probability) {
        this.probability = probability;
    }


    public Chance not() {
        return new Chance(valueForCertainty - probability);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chance)) return false;

        Chance chance = (Chance) o;

        if (Float.compare(chance.probability, probability) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (probability != +0.0f ? Float.floatToIntBits(probability) : 0);
    }

}
