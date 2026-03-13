package lab.problems.problem4;

public class Parallel extends Circuit {
    private Circuit first;
    private Circuit second;
    private double potentialDifference;
    
    public Parallel(Circuit first, Circuit second) {
        this.first = first;
        this.second = second;
        this.potentialDifference = 0;
    }
    
    @Override
    public double getResistance() {
        double r1 = first.getResistance();
        double r2 = second.getResistance();
        
        if (r1 == 0 || r2 == 0) return 0;
        
        return (r1 * r2) / (r1 + r2);
    }
    
    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }
    
    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;
        first.applyPotentialDiff(V);
        second.applyPotentialDiff(V);
    }
}
