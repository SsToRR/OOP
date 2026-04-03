package problem4;

public abstract class Circuit {

    protected double potentialDifference;

    public abstract double getResistance();

    public abstract double getPotentialDiff();

    public abstract void applyPotentialDiff(double V);

    public double getCurrent() {
        return getPotentialDiff() / getResistance();
    }

    public double getPower() {
        return getPotentialDiff() * getCurrent();
    }
}

