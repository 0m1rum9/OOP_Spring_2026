package lab.problems.problem5;

public class PhDStudent extends Person {
    private String researchArea;
    
    public PhDStudent(String name, int age, String major, String researchArea) {
        super(name, age);
        this.researchArea = researchArea;
    }
    
    @Override
    public String getOccupation() {
        return "PhD Student - " + researchArea;
    }
    
    @Override
    protected boolean canHavePet(Animal pet) {
        return !(pet instanceof Dog);
    }
    
    public String getResearchArea() {
        return researchArea;
    }
    
    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }
}
