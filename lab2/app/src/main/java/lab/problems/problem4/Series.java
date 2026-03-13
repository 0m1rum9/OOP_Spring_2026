package lab.problems.problem4;

public class Series extends Circuit {
    private Circuit first;
    private Circuit second;
    private double potentialDifference;
    
    public Series(Circuit first, Circuit second) {
        this.first = first;
        this.second = second;
        this.potentialDifference = 0;
    }
    
    @Override
    public double getResistance() {
        return first.getResistance() + second.getResistance();
    }
    
    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }
    
    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;
        
        double totalResistance = getResistance();
        if (totalResistance == 0) {
            first.applyPotentialDiff(0);
            second.applyPotentialDiff(0);
        } else {
            double current = V / totalResistance;
            first.applyPotentialDiff(current * first.getResistance());
            second.applyPotentialDiff(current * second.getResistance());
        }
    }
}
