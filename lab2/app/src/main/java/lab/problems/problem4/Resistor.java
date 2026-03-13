package lab.problems.problem4;

public class Resistor extends Circuit {
    private double resistance;
    private double potentialDifference;
    
    public Resistor(double ohms) {
        this.resistance = ohms;
        this.potentialDifference = 0;
    }
    
    @Override
    public double getResistance() {
        return resistance;
    }
    
    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }
    
    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;
    }
    
    public void setResistance(double ohms) {
        this.resistance = ohms;
    }
}
